package com.example.OnlinePolling.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.example.OnlinePolling.Entity.ResultEntity;

public interface ResultRepo extends JpaRepository<ResultEntity, Integer> {
     List<ResultEntity> findAll();
}
