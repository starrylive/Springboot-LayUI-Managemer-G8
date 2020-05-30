package com.aaa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: 陈建
 * @Date: 2020/5/22 0022 16:55
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayUiTable {
    private int code;
    private String msg;
    private long count;
    private List<?> data;
}
