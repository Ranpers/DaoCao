package pers.yiran.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("ums_menu")
public class UmsMenu {
    @TableId
    private Long id;
    private Long parentId;
    private String menuName;
    private Integer sort;
    private Integer menuType;
    private String path;
    private String componentPath;
    private String perms;
    private String icon;
    private Integer status;
    private String remark;
    private String creator;
    private String updater;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    @TableLogic
    private Integer deleted;
}