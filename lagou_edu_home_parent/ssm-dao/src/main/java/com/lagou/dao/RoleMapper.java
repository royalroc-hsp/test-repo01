package com.lagou.dao;

import com.lagou.domain.Role;

import java.util.List;

public interface RoleMapper {

    //查询所有角色
    public List<Role> findAllRole(Role role);
}
