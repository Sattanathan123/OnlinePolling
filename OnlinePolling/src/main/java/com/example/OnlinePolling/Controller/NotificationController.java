package com.example.OnlinePolling.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlinePolling.Service.NotificationService;

@RestController
public class NotificationController {
     @Autowired NotificationService ser;
     @PostMapping("/notify")
     public String notifyEmail(@RequestParam String receiver,@RequestParam String sub,@RequestParam String msg) {
    	 return ser.sendMail(receiver, sub, msg);
     }
}
