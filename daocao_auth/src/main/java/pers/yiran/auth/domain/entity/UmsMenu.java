package pers.yiran.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
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
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    @TableLogic
    private Integer deleted;
}