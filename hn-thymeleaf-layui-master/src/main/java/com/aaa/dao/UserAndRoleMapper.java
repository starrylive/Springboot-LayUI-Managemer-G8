package com.aaa.dao;

import com.aaa.entity.UserAndRoleKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserAndRoleMapper {
    int deleteByPrimaryKey(UserAndRoleKey key);

    int insert(UserAndRoleKey record);

    int insertSelective(UserAndRoleKey record);
}