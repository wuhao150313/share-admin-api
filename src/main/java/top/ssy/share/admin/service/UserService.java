package top.ssy.share.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import top.ssy.share.admin.common.result.PageResult;
import top.ssy.share.admin.model.entity.User;
import top.ssy.share.admin.model.query.UserQuery;
import top.ssy.share.admin.model.vo.UserInfoVO;

public interface UserService extends IService<User> {
    PageResult<UserInfoVO> page(UserQuery query);
}
