package com.example.OnlinePolling.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlinePolling.Entity.NotificationEntity;

@Repository
public interface NotificationRepo extends JpaRepository<NotificationEntity, Integer> {

}
