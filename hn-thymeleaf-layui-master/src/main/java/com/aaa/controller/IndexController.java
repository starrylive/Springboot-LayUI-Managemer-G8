package com.aaa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xujiafu
 * @date 2020/5/29 9:53
 */
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/index")

    public String index() {
        logger.info("定向主页");
        return "index";
    }

}
