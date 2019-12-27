package com.bbdog.demo.views.chat;

import com.bbdog.demo.system.webSocket.WebSocketConfig;
import com.bbdog.demo.system.webSocket.WebSocketServer;
import com.bbdog.demo.views.base.BaseController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/chat")
public class ChatController extends BaseController {

//    public static WebSocketConfig webSocketConfig;
    //页面请求
    @GetMapping("/socket/{cid}")
    public String socket(@PathVariable String cid, HttpServletRequest request, Model model) {
        model.addAttribute("cid", cid);
        model.addAttribute("besePath",request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort());
        return "/test/webSocket";
    }
    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public String pushToWeb(@PathVariable String cid,String message) {
        try {
            WebSocketServer.sendInfo(message,cid);
        } catch (IOException e) {
            e.printStackTrace();
            return cid+"#"+e.getMessage();
        }
        return cid;
    }

}
