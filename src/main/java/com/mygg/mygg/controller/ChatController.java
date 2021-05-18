package com.mygg.mygg.controller;

import com.mygg.mygg.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;


    @PostMapping("/test/request")
    public String request(@RequestBody Map<String,String> json){
        System.out.println(json.get("status")+"테스트리퀘스트에서받음");

        chatService.updateStatus(json);

        return "okay";
    }

    @PostMapping("/")
    public String login(@RequestBody Map<String,String> json, HttpServletRequest request){
        String id = json.get("id");
        HttpSession session = request.getSession();
        session.setAttribute("userId",id);
        return "good";
    }
}