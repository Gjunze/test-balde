package com.bladejava.Module;

import com.blade.jdbc.annotation.Table;
import com.blade.jdbc.core.ActiveRecord;
import lombok.Data;

@Data
@Table(value = "user")
public class User extends ActiveRecord {
    private Integer userid;
    private String userpwd;
    private String username;
    private String userage;
}
