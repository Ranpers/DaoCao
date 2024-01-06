// 封装axios

import axios from 'axios';

import router from '@/router/index.js'

const request = axios.create({
    baseURL: 'http://127.0.0.1:8080/api/',
    withCredentials: false, //配置请求接口跨域是否需要凭证
    timeout: 10000,
});

// 配置请求头的参数类型，和编码格式
axios.defaults.headers['Content-Type'] = 'application/json?chatset=utf-8'

// 配置请求拦截器
request.interceptors.request.use(
    config => {
        // 判断是否需要发送token，在请求头中添加token
        // TODO 后续使用pinia管理token
        if (localStorage.getItem('token')) {
            config.headers.Authorization = localStorage.getItem('token');
        }
        return config;
    },
    error => {
        console.log("请求异常===》", error);
        return Promise.reject(error);
    }
);

// 配置响应拦截器
request.interceptors.response.use((response) => {
    // 判断响应码，后端返回的数据  code ，data，msg
    let {msg,code} = response.data
    console.log("code=====>",code,'msg====>',msg);
    if(code == null) {
        return response;
    }else if(code == 200) {
        return response;
    }else if(code == 500) {
        ElMessage.error('服务端异常！');
    }else if(code == 401) {
        ElMessage.error('没有操作权限！');
    }else if(code == 403) {
        ElMessage.error('登录过期！');
        // 需要重新登陆，跳转到登录页面，清除pinia中的数据，sessionStorage中
        window.sessionStorage.clear();
        router.push('/login');
    }
    return Promise.reject(msg);
},(error) => {
    // 出现异常
    ElMessage.error('error=====>',error);
    window.sessionStorage.clear();
    router.push('/login');
    return Promise.reject(error);
})

// 导出
export default request;