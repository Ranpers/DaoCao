package pers.yiran.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("ums_role")
public class UmsRole implements Serializable {
    @TableId
    private Long id;
    private String roleLabel;
    private String roleName;
    private Integer sort;
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