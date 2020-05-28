package com.aaa.dao;

import com.aaa.entity.RoleAndMenuKey;

public interface RoleAndMenuMapper {
    int deleteByPrimaryKey(RoleAndMenuKey key);

    int insert(RoleAndMenuKey record);

    int insertSelective(RoleAndMenuKey record);
}