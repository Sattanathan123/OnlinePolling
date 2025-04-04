package com.example.OnlinePolling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.OnlinePolling.Entity.PollOptionEntity;
import com.example.OnlinePolling.Repo.PollOptionRepo;

@Service
public class PollOptionService {
	@Autowired 
	PollOptionRepo opt;
	
	public List<PollOptionEntity> getOption()
	{
		return opt.findAll();
	}
	
	public PollOptionEntity post(PollOptionEntity use)
	{
		return opt.save(use);
	}   
	public String deleId(int id) {
		if(opt.existsById(id)) {
			opt.deleteById(id);
			return "Value Deleted Successfully";
		}
		else
		{
		    return "Value not Found"+id;
		}
		
	}
	public PollOptionEntity updateDisp(int id,PollOptionEntity etd)    
	{
		if(opt.existsById(id))  
		{
			PollOptionEntity options=opt.findById(id).get();
            options.setPollId(etd.getPollId());
            options.setOptText(etd.getOptText());
            options.setVoteCount(etd.getVoteCount());

			return opt.save(options);
			
		}
		return etd;
	}
	public Page<PollOptionEntity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return opt.findAll(obj);
		
	}
}
