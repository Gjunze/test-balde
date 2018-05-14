package com.bladejava.Dao;

import com.blade.ioc.annotation.Bean;
import com.bladejava.Module.Student;

import java.awt.*;
import java.util.ArrayList;

@Bean
public class LoginDao {

    //验证是否成功找到用户
    public boolean validateDao(String id,String pwd){
        Student  student=new Student();
        return true;
    }
}
