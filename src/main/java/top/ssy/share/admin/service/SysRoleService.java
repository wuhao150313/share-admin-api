package top.ssy.share.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.ssy.share.admin.common.result.PageResult;
import top.ssy.share.admin.model.entity.SysRole;
import top.ssy.share.admin.model.query.SysRoleQuery;
import top.ssy.share.admin.model.vo.SysRoleVO;

import java.util.List;

public interface SysRoleService extends IService<SysRole> {
    PageResult<SysRoleVO> page(SysRoleQuery query);

    List<SysRoleVO> getList(SysRoleQuery query);

    void save(SysRoleVO vo);

    void update(SysRoleVO vo);

    void delete(List<Integer> idList);
}
