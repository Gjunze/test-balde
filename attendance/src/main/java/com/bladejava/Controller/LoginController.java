package com.bladejava.Controller;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Response;
import com.bladejava.service.LoginService;


@Path("auth")
public class LoginController {

    @GetRoute("/login")
    public void login(Response response){
         response.render("login.html" );
    }

    @Inject
    LoginService loginService;



}
