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
import com.example.OnlinePolling.Entity.ResultEntity;
import com.example.OnlinePolling.Service.ResultService;
@RestController
public class ResultController {
     @Autowired
     ResultService ser;
     @GetMapping("/result")
     public List<ResultEntity> dispResult()
     {
    	 return ser.getResult();
     }
     @PostMapping("/postResult")
  	public ResultEntity postResult(@RequestBody ResultEntity obj)
  	{
  		return ser.postResult(obj);
  	}
  	 @DeleteMapping("/delResult/{sno}")
  	  public String delId(@PathVariable int sno)
  	  {
  		 return ser.deleteResult(sno);
  	  }
      @PutMapping("/updateResult/{id}")
      public ResultEntity updateResult(@PathVariable int id,@RequestBody ResultEntity ob)
      {
      	return ser.updateResult(id,ob);
      }
      @GetMapping("/respage")
      public Page<ResultEntity> Paging(@RequestParam int page,@RequestParam int size)
      {
      	return ser.get_data_all(page,size);
      }
}
