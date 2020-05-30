package com.aaa.dao;

import com.aaa.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /*获取所有的用户*/
    List<User>  findAllUser();


    /**
     * 根据用户的部门id查找部门
     * */

    String findDeptNameByDeptId( int dept_id);

    /**
     *
     *
     * */
}