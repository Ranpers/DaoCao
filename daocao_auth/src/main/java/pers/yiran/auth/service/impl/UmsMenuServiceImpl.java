package pers.yiran.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.yiran.auth.domain.entity.UmsMenu;
import pers.yiran.auth.mapper.UmsMenuMapper;
import pers.yiran.auth.service.IUmsMenuService;

@Service
public class UmsMenuServiceImpl extends ServiceImpl<UmsMenuMapper, UmsMenu> implements IUmsMenuService{
}
