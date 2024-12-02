package top.ssy.share.admin.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "账号登录")
public class SysAccountLoginVO  {

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;

}
