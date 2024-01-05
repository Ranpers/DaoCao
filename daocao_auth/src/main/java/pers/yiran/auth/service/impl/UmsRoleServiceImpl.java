package pers.yiran.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.yiran.auth.domain.entity.UmsRole;
import pers.yiran.auth.mapper.UmsRoleMapper;
import pers.yiran.auth.service.IUmsRoleService;

@Service
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleMapper, UmsRole> implements IUmsRoleService {
}
