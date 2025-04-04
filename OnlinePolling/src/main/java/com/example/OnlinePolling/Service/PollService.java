package com.example.OnlinePolling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.OnlinePolling.Entity.LoginEntity;
import com.example.OnlinePolling.Entity.PollEntity;
import com.example.OnlinePolling.Repo.LoginRepo;
import com.example.OnlinePolling.Repo.PollRepo;

@Service
public class PollService {
	@Autowired 
	PollRepo rep;
	
	public List<PollEntity> getall()
	{
		return rep.findAll();
	}
	
	public PollEntity post(PollEntity user)
	{
		return rep.save(user);
	}   
	public String deleId(int id) {
		if(rep.existsById(id)) {
			rep.deleteById(id);
			return "Value Deleted Successfully";
		}
		else
		{
		    return "Value not Found"+id;
		}
		
	}
	public PollEntity updateDisp(int id,PollEntity etd)    
	{
		if(rep.existsById(id))  
		{
			PollEntity poll=rep.findById(id).get();
			poll.setPid(etd.getPid());
			poll.setTitle(etd.getTitle());
			poll.setDesc(etd.getDesc());
			poll.setCtime(etd.getCtime());
			poll.setStime(etd.getStime());
			poll.setEtime(etd.getEtime());
			poll.setStatus(etd.getStatus());
			poll.setCreated(etd.getCreated());
			poll.setUtime(etd.getUtime());

			return rep.save(poll);
			
		}
		return etd;
	}
	public Page<PollEntity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);
		
	}
}
