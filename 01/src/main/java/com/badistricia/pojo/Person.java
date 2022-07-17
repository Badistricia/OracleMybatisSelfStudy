package com.badistricia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author badistricia
 * @version 1.0
 * @description :
 * @date 2022/7/17 15:44:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
        private  int id;
        private String name;
        private String gender;

}
