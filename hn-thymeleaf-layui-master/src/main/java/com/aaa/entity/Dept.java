package com.aaa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer deptId;

    private String deptName;

    private Integer orderNum;

    private String status;

    private String delFlag;


}