package com.bladejava;

import com.blade.Blade;
import com.blade.event.EventType;

public class Application {
    public static void main(String[] args) {
        Blade.me()
                .get("/",((request, response) -> response.render("login.html")))
                .use(s -> {
                    System.out.println(s.getAction());
                    return true;
                })
                .addStatics("/assets")
                .start(Application.class);
    }
}
