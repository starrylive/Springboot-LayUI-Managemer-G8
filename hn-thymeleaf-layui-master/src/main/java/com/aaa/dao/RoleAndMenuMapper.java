package com.aaa.dao;

import com.aaa.entity.RoleAndMenuKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RoleAndMenuMapper {
    int deleteByPrimaryKey(RoleAndMenuKey key);

    int insert(RoleAndMenuKey record);

    int insertSelective(RoleAndMenuKey record);
}