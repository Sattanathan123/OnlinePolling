package com.example.OnlinePolling.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OnlinePolling.Entity.PollOptionEntity;
@Repository
public interface PollOptionRepo extends JpaRepository<PollOptionEntity, Integer>{
   List<PollOptionEntity> findAll();
}
