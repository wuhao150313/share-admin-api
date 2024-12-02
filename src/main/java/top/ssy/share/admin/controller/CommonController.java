package top.ssy.share.admin.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.ssy.share.admin.common.result.Result;
import top.ssy.share.admin.model.vo.FileUrlVO;
import top.ssy.share.admin.service.CommonService;

@Tag(name = "通用模块")
@RestController
@RequestMapping("common")
@AllArgsConstructor
public class CommonController {

    private final CommonService commonService;

    @PostMapping(value = "/upload/img")
    @ResponseBody
    @Operation(summary = "图片上传")
    public Result<FileUrlVO> upload(@RequestBody MultipartFile file) {
        return Result.ok(commonService.upload(file));
    }
}