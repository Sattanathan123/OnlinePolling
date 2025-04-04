package com.example.OnlinePolling.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Result")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultEntity {
      @Id
      @Column(name="result_id")
  	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int resId;
      @Column(name="poll_id")
      private String pollId;
      @Column(name="winning_id")
      private int winId;
      @Column(name="Total_votes")
      private int totVotes;
      
}
