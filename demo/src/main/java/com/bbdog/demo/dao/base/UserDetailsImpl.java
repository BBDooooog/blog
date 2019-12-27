package com.bbdog.demo.dao.base;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Author: clover_4l
 * Date: 11-5-13
 * Time: 上午10:44
 */
public class UserDetailsImpl extends org.springframework.security.core.userdetails.User {
    private static final long serialVersionUID = 3244770350501840299L;

    private long userId;

    public UserDetailsImpl(IUser user, Collection<? extends GrantedAuthority> authorities) {
        super(user.getLoginName(), user.getPassword(), true, true, true, true, authorities);
        this.userId = user.getId();
    }

    public long getUserId() {
        return userId;
    }




}
