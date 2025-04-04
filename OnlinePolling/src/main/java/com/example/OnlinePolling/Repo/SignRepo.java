package com.example.OnlinePolling.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlinePolling.Entity.SignEntity;

@Repository
public interface SignRepo extends JpaRepository<SignEntity, Integer>{
	  List<SignEntity>  findAll();

	List<SignEntity> findByUserStartingWith(String user);

	List<SignEntity> findByUserContains(String user);

	List<SignEntity> findByUserEndingWith(String user);
	List<SignEntity> findByUserNotContains(String user);
}
