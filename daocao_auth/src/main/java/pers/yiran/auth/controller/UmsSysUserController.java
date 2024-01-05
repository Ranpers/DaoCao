package pers.yiran.auth.controller;

import org.springframework.web.bind.annotation.*;
import pers.yiran.auth.domain.entity.UmsSysUser;
import pers.yiran.auth.service.IUmsSysUserService;
import pers.yiran.common.response.DaoCaoResult;

import java.util.List;

@RestController
@RequestMapping("ums/sys_user")
public class UmsSysUserController {
    private final IUmsSysUserService sysUserService;

    public UmsSysUserController(IUmsSysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @PostMapping
    public DaoCaoResult addSysUser(@RequestBody UmsSysUser user) {
        boolean flag = sysUserService.save(user);
        if(flag){
            return DaoCaoResult.success();
        }
        return DaoCaoResult.error();
    }

    @GetMapping
    public DaoCaoResult searchList() {
        List<UmsSysUser> list = sysUserService.list();
        list.forEach(System.out::println);
        return DaoCaoResult.success().put("data", list);
    }
}
