package com.example.OnlinePolling.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlinePolling.Entity.LoginEntity;
import com.example.OnlinePolling.Service.LoginService;

@RestController
public class LoginController {
     @Autowired
     private LoginService log;
     @GetMapping("/login")
     public List<LoginEntity> disp()
     {
    	 return log.getall();
     }
     @PostMapping("/post")
 	public LoginEntity postall(@RequestBody LoginEntity obj)
 	{
 		return log.post(obj);
 	}
 	@DeleteMapping("/delete/{sno}")
 	public String delId(@PathVariable int sno)
 	{
 		return log.deleteId(sno);
 	}
     @PutMapping("/update/{id}")
     public LoginEntity updateById(@PathVariable int id,@RequestBody LoginEntity ob)
     {
     	return log.updateId(id,ob);
     }
     @GetMapping("/page")
     public Page<LoginEntity> Paging(@RequestParam int page,@RequestParam int size)
     {
     	return log.get_data_all(page,size);
     }

}