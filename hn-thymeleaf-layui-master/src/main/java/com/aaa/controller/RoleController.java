package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xujiafu
 * @date 2020/5/29 16:28
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @RequestMapping("toShowRole")
    public String toShowRole() {

        return "role";
    }
}
