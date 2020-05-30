package com.aaa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: 陈建
 * @Date: 2020/5/28 0028 11:44
 * @Version 1.0
 * 定义layui的树形菜单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayUiTree {

    private String title;
    private int id;
    private String field;
    private boolean checked;
    private boolean spread;
    private List<LayUiTree> children;


}
