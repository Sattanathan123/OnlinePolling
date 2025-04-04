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
import com.example.OnlinePolling.Entity.SignEntity;
import com.example.OnlinePolling.Service.SignService;

@RestController

public class SignController {
	 @Autowired
     private SignService sign;
     @GetMapping("/sign")
     public List<SignEntity> disp()
     {
    	 return sign.getall();
     }
     @PostMapping("/push")
 	public SignEntity postall(@RequestBody SignEntity obj)
 	{
 		return sign.post(obj);
 	}
 	@DeleteMapping("/del/{sno}")
 	public String delId(@PathVariable int sno)
 	{
 		return sign.deleteId(sno);
 	}
     @PutMapping("/signput/{id}")
     public SignEntity updateById(@PathVariable int id,@RequestBody SignEntity ob)
     {
     	return sign.updateId(id,ob);
     }
     @GetMapping("/signpage")
     public Page<SignEntity> Paging(@RequestParam int page,@RequestParam int size)
     {
     	return sign.get_data_all(page,size);
     }
     @PostMapping("/oneToMany")
     public SignEntity postUser(@RequestBody SignEntity sig) {
     	return sign.oneToMany(sig);
     }
     @GetMapping("/Start")
     public List<SignEntity> Starting(@RequestParam String user)
     {
     	return sign.start(user);
     }
     @GetMapping("/Ends")
     public List<SignEntity> Ending(@RequestParam String user)
     {
     	return sign.end(user);
     }
     @GetMapping("/Contain")
     public List<SignEntity> Having(@RequestParam String user)
     {
     	return sign.Contain(user);
     }
     @GetMapping("/NotContain")
     public List<SignEntity> NotContain(@RequestParam String user){
    	 return sign.NotContains(user);
     }
}
