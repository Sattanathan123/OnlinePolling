package com.example.OnlinePolling.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlinePolling.Entity.LoginEntity;


@Repository

public interface LoginRepo extends JpaRepository<LoginEntity, Integer>{
    List<LoginEntity> findAll();
}
