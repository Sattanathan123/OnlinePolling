package com.example.OnlinePolling.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.OnlinePolling.Entity.NotificationEntity;
import com.example.OnlinePolling.Repo.NotificationRepo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class NotificationService {
	@Autowired JavaMailSender sender;  //Its an interface used to store the sender api's
    @Autowired NotificationRepo rep;
    public String sendMail(String receiver,String subject,String body) {
 	   try {
 	      MimeMessage msg = sender.createMimeMessage();  //Its a class Used to attach to the sender
 	      MimeMessageHelper helper = new MimeMessageHelper(msg); //Its a class used to check the structure of msg
 	      //Which is used to send the datas which is the user input
 	      helper.setTo(receiver);
 	      helper.setSubject(subject);
 	      helper.setText(body,true);   //This three will allocate the msgs for each receiver,sub,body setText is used to alocate the any text
 	      helper.setFrom("vbsattanathan@gmail.com");
 	      sender.send(msg);
 	      NotificationEntity email=new NotificationEntity(); //Wants to create an object because to store the realworld inputs to the databases 
 	      //To store the values in the databases
 	      email.setRmail(receiver);
 	      email.setSub(subject);
 	      email.setMsg(body);
 	      rep.save(email); //when we denote email it contains all the variables
 	      return "Email sends Successfully to "+receiver;
    }
 	      catch (MessagingException e) {
				return "This Email not found "+receiver+e.getMessage();
			}
 	      
    }
    
}

       

