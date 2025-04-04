package com.example.OnlinePolling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.OnlinePolling.Entity.ResultEntity;
import com.example.OnlinePolling.Repo.ResultRepo;

@Service
public class ResultService {
        @Autowired
        ResultRepo res;
        public List<ResultEntity> getResult()
        {
        	return res.findAll();
        }
        public ResultEntity postResult(ResultEntity user)
		{
			return res.save(user);
		}   
	    public String deleteResult(int resId) {
		   if(res.existsById(resId)) {
			  res.deleteById(resId);
			  return "Value Deleted Successfully";
		   }
		   else
		   {
			 return "Value not Found"+resId;
		   }
			
		 }
	    public ResultEntity updateResult(int resId,ResultEntity etd)
		{
			if(res.existsById(resId))  
			{
				ResultEntity obj=res.findById(resId).get();
				obj.setPollId(etd.getPollId());
				obj.setTotVotes(etd.getTotVotes());
				obj.setWinId(etd.getWinId());
				return res.save(obj);
			}
			return etd;
		}
	    
	    public Page<ResultEntity> get_data_all(int page,int size) {
			PageRequest obj=PageRequest.of(page, size);
			return res.findAll(obj);
			
		}
}
