package pers.yiran.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.yiran.auth.domain.dto.LoginDto;
import pers.yiran.common.response.DaoCaoResult;

@Slf4j
@RestController
@RequestMapping("auth")
public class AuthController {
    /**
     * 系统用户登陆
     * @return DaoCaoResult
     */
    @PostMapping("sys")
    public DaoCaoResult login(@RequestBody LoginDto loginDto) {
        log.info("loginDto=====>{}", loginDto);
        return DaoCaoResult.success();
    }
}
