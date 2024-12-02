package top.ssy.share.admin.service;

import org.springframework.web.multipart.MultipartFile;
import top.ssy.share.admin.model.vo.FileUrlVO;

public interface CommonService {

    FileUrlVO upload(MultipartFile uploadFile);

}
