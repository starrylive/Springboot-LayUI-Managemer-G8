package com.aaa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.MatchPattern;
import net.sf.oval.constraint.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /*pojo属性与数据库字段不一致的时候要用resultMap指定*/
    private Integer userId;

    private Integer deptId;
//    @NotNull(message = "用户名不能为空，请您先填写用户名")
    private String loginName;

    private String userName;

    private String email;
//    @NotNull(message = "手机号不能为空，请您先填写手机号")
    private String phonenumber;
//    @NotNull(message = "密码不能为空，请您先填写手机号")
//    @MatchPattern(pattern = "^[0-9_a-zA-Z]{6,20}$", message = "用户名或密码有误，请您重新填写")
    private String password;
    private String sex;

    private String avatar;


    private String salt;

    private String status;

    private String delFlag;

}