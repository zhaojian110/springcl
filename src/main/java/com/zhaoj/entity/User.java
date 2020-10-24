package com.zhaoj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者:zhaoj
 * 创建时间:2020/10/21    20:18
 * 类的作用:
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private Integer age;
}
