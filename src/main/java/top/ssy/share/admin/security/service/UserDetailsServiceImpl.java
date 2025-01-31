package top.ssy.share.admin.security.service;

import top.ssy.share.admin.model.entity.SysManager;
import top.ssy.share.admin.mapper.SysManagerMapper;
import top.ssy.share.admin.service.SysManagerDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final SysManagerDetailsService sysManagerDetailsService;
    private final SysManagerMapper sysManagerMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysManager sysManager = sysManagerMapper.getByUsername(username);
        if (sysManager == null) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        return sysManagerDetailsService.getManagerDetails(sysManager);
    }
}
