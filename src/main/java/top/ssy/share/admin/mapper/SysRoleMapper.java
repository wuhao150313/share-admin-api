package top.ssy.share.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.ssy.share.admin.model.entity.SysRole;
import top.ssy.share.admin.model.query.SysRoleQuery;
import top.ssy.share.admin.model.vo.SysRoleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRoleVO> getRolePage(Page<SysRoleVO> page, @Param("query") SysRoleQuery query);

}
