package com.example.OnlinePolling.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlinePolling.Entity.PollEntity;

@Repository
public interface PollRepo extends JpaRepository<PollEntity, Integer> {
     List<PollEntity> findAll();
}
