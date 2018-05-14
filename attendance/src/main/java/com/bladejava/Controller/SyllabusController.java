package com.bladejava.Controller;


import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Response;
import com.blade.mvc.ui.ModelAndView;

@Path("/")
public class SyllabusController {

    @GetRoute("syllabus")
    public void syllabus(Response response){
        response.render("student-table.html");
    }


}
