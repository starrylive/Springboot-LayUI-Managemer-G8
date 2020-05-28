package com.aaa.dao;

import com.aaa.entity.UserAndRoleKey;

public interface UserAndRoleMapper {
    int deleteByPrimaryKey(UserAndRoleKey key);

    int insert(UserAndRoleKey record);

    int insertSelective(UserAndRoleKey record);
}