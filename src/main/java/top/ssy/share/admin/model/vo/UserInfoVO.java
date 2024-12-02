package top.ssy.share.admin.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(name = "UserInfoVO", description = "用户信息返回vo")
public class UserInfoVO {
    @Schema(name = "pk_id", description = "用户id")
    private Integer pkId;

    @Schema(name = "nickname", description = "昵称")
    private String nickname;

    @Schema(name = "phone", description = "手机号")
    private String phone;

    @Schema(name = "wxOpenId", description = "微信openid")
    private String wxOpenId;

    @Schema(name = "avatar", description = "头像")
    private String avatar;

    @Schema(name = "gender", description = "性别")
    private Integer gender;

    @Schema(name = "birthday", description = "生日")
    private String birthday;

    @Schema(name = "bonus", description = "积分")
    private Integer bonus;

    @Schema(name = "remark", description = "备注")
    private String remark;

    @Schema(description = "账户状态")
    private Integer enabled;

    @Schema(name = "createTime", description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
}