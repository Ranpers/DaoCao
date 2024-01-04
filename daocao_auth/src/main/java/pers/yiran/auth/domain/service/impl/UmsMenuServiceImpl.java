package pers.yiran.auth.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.yiran.auth.domain.entity.UmsMenu;
import pers.yiran.auth.domain.mapper.UmsMenuMapper;
import pers.yiran.auth.domain.service.IUmsMenuService;

@Service
public class UmsMenuServiceImpl extends ServiceImpl<UmsMenuMapper, UmsMenu> implements IUmsMenuService{
}
