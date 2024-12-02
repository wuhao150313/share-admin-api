package top.ssy.share.admin.model.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import top.ssy.share.admin.common.model.Query;

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "用户查询")
public class UserQuery extends Query {
    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "手机号")
    private String phone;

    @Schema(description = "性别")
    private Integer gender;
}