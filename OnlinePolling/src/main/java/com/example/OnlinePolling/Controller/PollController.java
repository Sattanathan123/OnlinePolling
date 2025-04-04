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
import com.example.OnlinePolling.Entity.PollEntity;
import com.example.OnlinePolling.Service.PollService;

@RestController
public class PollController {
     @Autowired
     private PollService std;
     @GetMapping("/fetchPoll")
     public  List<PollEntity> Fetchall()
     {
    	 return std.getall();
     }
     @PostMapping("/PollPost")
  	public PollEntity postall(@RequestBody PollEntity obj)
  	{
  		return std.post(obj);
  	}
  	@DeleteMapping("/dele/{sno}")
  	public String delId(@PathVariable int sno)
  	{
  		return std.deleId(sno);
  	}
      @PutMapping("/updatePoll/{id}")
      public PollEntity updateId(@PathVariable int id,@RequestBody PollEntity ost)
      {
      	return std.updateDisp(id,ost);
      }
      @GetMapping("/pagePoll")
      public Page<PollEntity> Paging(@RequestParam int page,@RequestParam int size)
      {
      	return std.get_data_all(page,size);
      }
}
