package pers.yiran.auth.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.yiran.auth.domain.entity.UmsSysUser;
import pers.yiran.auth.domain.mapper.UmsSysUserMapper;
import pers.yiran.auth.domain.service.IUmsSysUserService;

@Service
public class UmsSysUserService extends ServiceImpl<UmsSysUserMapper, UmsSysUser> implements IUmsSysUserService {
}
