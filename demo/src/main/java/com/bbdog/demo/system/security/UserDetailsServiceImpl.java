package com.bbdog.demo.system.security;

import com.bbdog.demo.dao.RoleDao;
import com.bbdog.demo.dao.UserRoleDao;
import com.bbdog.demo.entity.Role;
import com.bbdog.demo.entity.User;
import com.bbdog.demo.entity.UserRole;
import com.bbdog.demo.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserManager userManager;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userManager.getUserByLoginName(userName);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 添加权限
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        List<UserRole> userRoles = userRoleDao.listUserRoleByUserId(user.getId());
        for (UserRole userRole : userRoles) {
            Role role = roleDao.get(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        // 返回UserDetails实现类
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), authorities);
    }
}
