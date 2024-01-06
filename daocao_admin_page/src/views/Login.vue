<template>
    <!-- 根div -->
    <div class="login_container">
        <!-- 登陆表单 -->
        <div class="login_form">
            <h3 class="title">稻草快速开发平台</h3>
            <el-form ref="formRef" :model="loginForm" label-width="auto">
                <!-- 用户名 -->
                <el-form-item>
                    <el-input v-model="loginForm.account" placeholder="请输入账号">
                        <template #prefix>
                            <el-icon class="el-input__icon"><User /></el-icon>
                        </template>
                    </el-input>
                </el-form-item>
                <!-- 密码 -->
                <el-form-item>
                    <el-input v-model="loginForm.password" show-password type="password" placeholder="请输入密码">
                        <template #prefix>
                            <el-icon class="el-input__icon"><Lock /></el-icon>
                        </template>
                    </el-input>
                </el-form-item>
                <!-- 记住我/忘记密码 -->
                <div class="remember_forget">
                    <el-checkbox v-model="loginForm.rememberMe" label="记住我" size="large" />
                    <el-text class="forget_pass mx-1" type="primary">忘记密码？</el-text>
                </div>
                <el-divider></el-divider>
                <!-- 其他的登陆方式 -->
                <div class="other_login">
                    <el-icon class="other_login_item"><ChromeFilled /></el-icon>
                    <el-icon class="other_login_item"><Eleme /></el-icon>
                    <el-icon class="other_login_item"><ElemeFilled /></el-icon>
                </div>
                <el-form-item>
                    <!-- 按钮 -->
                    <el-button type="primary">登陆</el-button>
                </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script setup>
import { ref } from 'vue';

const loginForm = ref({
    account: undefined,
    password: undefined,
    rememberMe: undefined
});
</script>

<style lang="scss" scoped>
.login_container {
    background-image: url('../assets/background/background.jpg');
    background-size: cover; /* 保持图片充满整个容器 */
    height: 100vh;
    display: flex;
    justify-content: center; /* 居中 */
    align-items: center; /* 垂直居中 */
}

.login_form {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    width: 30%;
    background-color: white;
    border-radius: 10px;

    .title {
        font-size: 2em;
        margin: 10% 10%;
    }

    .remember_forget {
        display: flex;
        justify-content: space-between;
        align-items: center;

        .forget_pass {
            cursor: pointer;
        }
    }

    .other_login {
        display: flex;
        justify-content: center;

        .other_login_item {
            margin: 10% 15%;
            cursor: pointer;
        }
    }
}

.el-form {
    width: 80%;
}

.el-form-item {
    width: 100%;
}

.el-button {
    margin-bottom: 5%;
    width: 100%;
    font-size: 1.2em;
}
</style>