package com.bladejava.Controller;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PathParam;
import com.blade.mvc.annotation.PostRoute;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;
import com.blade.mvc.ui.RestResponse;
import com.bladejava.Module.Student;
import com.bladejava.service.LoginService;

import java.util.List;

@Path(value = "req")
public class RequestController {
    @Inject
    LoginService loginService;

    @PostRoute("isRightUser")
    public void isRightUser(Request request,  Response response){
        String id=request.query("students[stuid]","20150001");
        String pwd=request.query("students[stupassword]","123456");
        System.out.println(id);
        if (loginService.validate(id)){
            response.render("index.html");
        }
    }

}

