import request from "@/utils/request";

// 登陆接口
export function login(data) {
  return request({
    url: "auth/sys",
    method: "post",
    data: data
  });
}