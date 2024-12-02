package top.ssy.share.admin.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.ssy.share.admin.common.model.BaseServiceImpl;
import top.ssy.share.admin.common.result.PageResult;
import top.ssy.share.admin.mapper.UserMapper;
import top.ssy.share.admin.model.entity.User;
import top.ssy.share.admin.model.query.UserQuery;
import top.ssy.share.admin.model.vo.UserInfoVO;
import top.ssy.share.admin.service.UserService;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User>
        implements UserService {

    @Override
    public PageResult<UserInfoVO> page(UserQuery query) {
        Page<UserInfoVO> page = new Page<>(query.getPage(), query.getLimit());
        List<UserInfoVO> list = baseMapper.getUserPage(page,query);
        return new PageResult<>(list,page.getTotal());
    }
}
