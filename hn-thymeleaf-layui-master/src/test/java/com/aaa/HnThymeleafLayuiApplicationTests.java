package com.aaa;

import com.aaa.biz.impl.MenuBizImpl;
import com.aaa.biz.impl.UserBizImpl;
import com.aaa.entity.LayUiTree;
import com.aaa.entity.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.aaa.entity.User;
import java.util.List;

@SpringBootTest

class HnThymeleafLayuiApplicationTests {
    @Autowired
    private MenuBizImpl menuBiz;
    @Autowired
    private UserBizImpl userBiz;


    @Test
    void contextLoads() {
        List<LayUiTree> menuList = menuBiz.selectAllMenu();
        for (LayUiTree menu : menuList) {
            System.out.println(menu.toString());
        }


    }

    @Test
    void findDeptNameByDeptId() {

        String deptName = userBiz.findDeptNameByDeptId(101);
        System.out.println(deptName);
    }

    @Test
    void  findAllUser(){
      List<User> myUserList =    userBiz.findAllUser();
        for (User user : myUserList) {
            System.out.println(user);
        }
    }
}
