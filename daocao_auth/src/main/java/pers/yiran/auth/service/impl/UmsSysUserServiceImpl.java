package pers.yiran.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.yiran.auth.domain.entity.UmsSysUser;
import pers.yiran.auth.mapper.UmsSysUserMapper;
import pers.yiran.auth.service.IUmsSysUserService;

@Service
public class UmsSysUserServiceImpl extends ServiceImpl<UmsSysUserMapper, UmsSysUser> implements IUmsSysUserService {
}
