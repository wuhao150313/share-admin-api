package top.ssy.share.admin.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@TableName("t_user")
public class User {
    @TableId(value = "pk_id", type= IdType.AUTO)
    private Integer pkId;

    private String phone;

    private String wxOpenId;

    private String avatar;

    private String nickname;

    private Integer gender;

    private String birthday;

    private Integer bonus;

    private String remark;
    /**
     * @see top.ssy.share.admin.enums.AccountStatusEnum
     */
    private Integer enabled;

    @TableField(value = "delete_flag", fill = FieldFill.INSERT)
    @TableLogic
    private Integer deleteFlag;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}
