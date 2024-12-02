package top.ssy.share.admin.model.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Schema(description = "图片上传后的Url地址")
@AllArgsConstructor
public class FileUrlVO {
    @Schema(description = "图片上传后的Url地址")
    private String fileUrl;
}
