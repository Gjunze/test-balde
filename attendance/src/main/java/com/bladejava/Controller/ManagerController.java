package com.bladejava.Controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Response;

@Path("/")
public class ManagerController {
    @GetRoute("manager")
    public void getmanager(Response response){
        response.render("manager.html");
    }
    @GetRoute("/index")
    public void getIndex(Response response){
        response.render("index.html");
    }
}
