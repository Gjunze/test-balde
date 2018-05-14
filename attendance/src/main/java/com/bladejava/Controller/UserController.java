package com.bladejava.Controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.ui.RestResponse;
import com.bladejava.Module.User;

import java.util.List;

@Path(value = "user",restful = true)
public class UserController {

      @GetRoute("/user")
      public RestResponse query(){

          User user=new User();
          List<User> list=user.queryAll("select * from user");
          System.out.println(list);
          return RestResponse.ok(new User().findAll());
      }
}
