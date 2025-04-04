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
import com.example.OnlinePolling.Entity.PollOptionEntity;
import com.example.OnlinePolling.Service.PollOptionService;

@RestController
public class PollOptionController {
     @Autowired
     PollOptionService std;
     @GetMapping("/getOption")
     public List<PollOptionEntity> getOptions()
     {
    	 return std.getOption();
     }
     @PostMapping("/postOptions")
   	public PollOptionEntity postOption(@RequestBody PollOptionEntity obj)
   	{
   		return std.post(obj);
   	}
   	@DeleteMapping("/delOption/{sno}")
   	public String delOptions(@PathVariable int sno)
   	{
   		return std.deleId(sno);
   	}
       @PutMapping("/updateOptions/{id}")
       public PollOptionEntity updateOption(@PathVariable int id,@RequestBody PollOptionEntity ost)
       {
       	return std.updateDisp(id, ost);
       }
       @GetMapping("/optpage")
       public Page<PollOptionEntity> Paging(@RequestParam int page,@RequestParam int size)
       {
       	return std.get_data_all(page,size);
       }
}
