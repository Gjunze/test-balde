package com.bladejava.service;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.annotation.Param;
import com.blade.mvc.annotation.PathParam;
import com.bladejava.Module.Student;
import io.github.biezhi.anima.Anima;
import lombok.extern.slf4j.Slf4j;


import java.util.List;

import static io.github.biezhi.anima.Anima.select;

@Bean
@Slf4j
public class LoginService {

    public boolean validate(@PathParam String stuid) {
        System.out.println(stuid+"bbbb");
        long count = select().from(Student.class).count();
        System.out.println(count);
      /*  Student student = select().from(Student.class).where(Student::getStuid).one();
        System.out.println(student.getStuid());*/
        List<Student> student = select().from(Student.class).byIds(1, 2, 3);
        System.out.println(student.size());
      /*  String name = select().bySQL(String.class, "select stuname from students where stuid=?",stuid).one();
        System.out.println(name);*/
      /* List<Student> student = Anima.select().bySQL(Student.class,
                "select stuid,stupassword from students where stuid= ? ", id).all();
       System.out.println(student.size());*/

        return true;
    }
}





