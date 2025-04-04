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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="vote")
public class VoteEntity {
        @Id
        @Column(name="vote_id")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private long voteId;
        @Column(name="user_id")
        private int userId;
        @Column(name="poll_id")
        private String pollId;
        @Column(name="option_id")
        private int optId;
        @Column(name="voted_at")
        private String votedTime;
}

