package com.example.OnlinePolling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.OnlinePolling.Entity.LoginEntity;
import com.example.OnlinePolling.Repo.LoginRepo;
@Service
public class LoginService {
	@Autowired 
	LoginRepo rep;
	public List<LoginEntity> getall()
	{
		return rep.findAll();
	}
	public LoginEntity post(LoginEntity user)
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
	public LoginEntity updateId(int id,LoginEntity etd)
	{
		if(rep.existsById(id))  
		{
			LoginEntity obj=rep.findById(id).get();
			obj.setUser(etd.getUser());
			obj.setPwd(etd.getPwd());
			return rep.save(obj);	
		}
		return etd;
	}
	public Page<LoginEntity> get_data_all(int page,int size) {
		PageRequest obj=PageRequest.of(page, size);
		return rep.findAll(obj);		
	}
}
