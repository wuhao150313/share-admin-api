package top.ssy.share.admin.convert;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.ssy.share.admin.model.entity.User;
import top.ssy.share.admin.model.vo.UserInfoVO;

import java.util.List;

@Mapper
public interface UserConvert {
     UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

     List<UserInfoVO> convert(List<User> list);
}
