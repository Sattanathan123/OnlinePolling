package com.example.OnlinePolling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.OnlinePolling.Entity.SignEntity;
import com.example.OnlinePolling.Repo.SignRepo;


@Service
public class SignService {
	@Autowired 
	SignRepo rep;
	
	public List<SignEntity> getall()
	{
		return rep.findAll();
	}
	
	public SignEntity post(SignEntity user)
	{
		return rep.save(user);
	}   
	public String deleteId(int id) {
		if(rep.existsById(id)) {
			rep.deleteById(id);
			return "Value Deleted Successfully";
		}
		else
		{
		    return "Value not Found"+id;
		}
		
	}
	public SignEntity updateId(int id,SignEntity etd)
	{
		if(rep.existsById(id))  
		{
			SignEntity obj=rep.findById(id).get();
			obj.setUser(etd.getUser());
			obj.setPwd(etd.getPwd());
			obj.setMail(etd.getMail());
			obj.setAdd(etd.getAdd());
			obj.setPhone(etd.getPhone());
			obj.setRole(etd.getRole());
			obj.setGender(etd.getGender());
			return rep.save(obj);
			
		}
		return etd;
	}
	public Page<SignEntity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);
		
	}
	public SignEntity oneToMany(SignEntity user) {
   	  return rep.save(user);
     }
	  //Starting with
		public  List<SignEntity> start(String user)
		{
			return rep.findByUserStartingWith(user);
		}
		//ending with
		public List<SignEntity> end(String user)
		{
			return rep.findByUserEndingWith(user);
		}
		public List<SignEntity> Contain(String user)
		{
			return rep.findByUserContains(user);
		}
		public List<SignEntity>  NotContains(String user){
			return rep.findByUserNotContains(user);
		}
} 
