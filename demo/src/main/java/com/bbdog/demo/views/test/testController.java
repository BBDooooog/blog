package com.bbdog.demo.views.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/")
public class testController {

    @RequestMapping(value = "webSocket.test")
    public String testWebSocket(){
        return "/test/webSocket";
    }
}
