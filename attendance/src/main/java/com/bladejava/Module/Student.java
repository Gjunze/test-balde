package com.bladejava.Module;

import com.blade.jdbc.annotation.Table;
import com.blade.jdbc.core.ActiveRecord;
import io.github.biezhi.anima.Model;
import lombok.Data;

@Data
@Table(value = "students",pk = "stuid")
public class Student extends Model {
    private String stuid;
    private String stuname;
    private String stupassword;
    private String stumajor;
    private String stustartdate;
    private String stustaus;
    private String classid;
}
