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
import com.example.OnlinePolling.Entity.VoteEntity;
import com.example.OnlinePolling.Service.VoteService;

@RestController
public class VoteController {
       @Autowired
       VoteService std;
       @GetMapping("/getVote")
       public List<VoteEntity> fetchAll()
       {
    	   return std.getVote();
       }
       @PostMapping("/postVote")
       public VoteEntity PushVote(@RequestBody VoteEntity ob)
       {
    	   return std.postVote(ob);
       }
       @DeleteMapping("/delVote/{uid}")
       public String RemoveVote(@PathVariable long uid)
       {
    	   return std.deleteVote(uid);
       }
       @PutMapping("/putVote/{vid}")
       public VoteEntity UpdateVote(@PathVariable long vid, @RequestBody VoteEntity eb)
       {
    	   return std.updateVote(vid,eb);
       }
       @GetMapping("/votepage")
       public Page<VoteEntity> Paging(@RequestParam int page,@RequestParam int size)
       {
       	return std.get_data_all(page,size);
       }
}
