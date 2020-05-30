package com.aaa.biz;

import com.aaa.entity.MyUserInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;
import com.aaa.entity.User;

/**
 * @Author: 陈建
 * @Date: 2020/5/22 0022 15:47
 * @Version 1.0
 * 用户相关的业务方法
 */
public interface UserBiz {

    PageInfo<User> selectAllUser(int page, int limit);
    MyUserInfo selectUserByUsername(String username);
    int insertSelective(MyUserInfo record);
    int delUserByID(List<String> ids);
    int updateByPrimaryKeySelective(MyUserInfo record);

    String findDeptNameByDeptId(int userId);

    List<User> findAllUser();
}
