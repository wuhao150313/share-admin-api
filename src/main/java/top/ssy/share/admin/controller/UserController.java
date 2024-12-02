package top.ssy.share.admin.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ssy.share.admin.common.result.PageResult;
import top.ssy.share.admin.common.result.Result;
import top.ssy.share.admin.model.query.UserQuery;
import top.ssy.share.admin.model.vo.UserInfoVO;
import top.ssy.share.admin.service.UserService;

@RestController
@AllArgsConstructor
@Tag(name = "用户管理", description = "用户管理")
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/page")
    @Operation(summary = "分页")
    @PreAuthorize("hasAuthority('sys:user:view')")
    public Result<PageResult<UserInfoVO>> page(@RequestBody @Valid UserQuery query) {
        return Result.ok(userService.page(query));
    }
}