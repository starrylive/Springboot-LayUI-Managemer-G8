package com.aaa.dao;

import com.aaa.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface MenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> selectAllMenu();
}