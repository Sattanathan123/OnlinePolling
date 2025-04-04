package com.example.OnlinePolling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.OnlinePolling.Entity.VoteEntity;
import com.example.OnlinePolling.Repo.VoteRepo;

@Service
public class VoteService {
      @Autowired
	  VoteRepo vot;
	  public List<VoteEntity> getVote()
	  {
		  return vot.findAll();
	  }
	  public VoteEntity postVote(VoteEntity user)
		{
			return vot.save(user);
		}   
	 public String deleteVote(long voteId) {
		if(vot.existsById(voteId)) {
			vot.deleteById(voteId);
			return "Value Deleted Successfully";
		}
		else
		{
			return "Value not Found"+voteId;
		}
			
		}
	 public VoteEntity updateVote(long voteId,VoteEntity etd)
		{
			if(vot.existsById(voteId))  
			{
				VoteEntity obj=vot.findById(voteId).get();
				obj.setUserId(etd.getUserId());
				obj.setOptId(etd.getOptId());
				obj.setPollId(etd.getPollId());
				obj.setVotedTime(etd.getVotedTime());
				return vot.save(obj);
			}
			return etd;
		}
	 public Page<VoteEntity> get_data_all(int page,int size) {
			PageRequest obj=PageRequest.of(page, size);
			return vot.findAll(obj);
			
		}
}
