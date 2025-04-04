package com.example.OnlinePolling.Repo;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlinePolling.Entity.VoteEntity;

public interface VoteRepo extends JpaRepository<VoteEntity, Long>{
        List<VoteEntity> findAll();
}
