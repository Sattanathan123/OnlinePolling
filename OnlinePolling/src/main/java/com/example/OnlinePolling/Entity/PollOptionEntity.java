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
@Table(name="PollOptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PollOptionEntity {
      @Id
      @Column(name="option_id")
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int opId;
      @Column(name="poll_id")
      private String pollId;
      @Column(name="opt_text")
      private String optText;
      @Column(name="vote_Count")
      private int voteCount;
}
