package com.bbdog.demo.system.security;

import com.bbdog.demo.entity.Role;
import com.bbdog.demo.entity.User;
import com.bbdog.demo.entity.UserRole;
import com.bbdog.demo.system.service.RoleService;
import com.bbdog.demo.system.service.UserRoleService;
import com.bbdog.demo.system.service.UserServiceImpl;
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
    private UserServiceImpl userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.getUserByLoginName(userName);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 添加权限
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        List<UserRole> userRoles = userRoleService.listByUserId(user.getUserId());
        for (UserRole userRole : userRoles) {
            Role role = roleService.selectById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        // 返回UserDetails实现类
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorities);
    }
}
