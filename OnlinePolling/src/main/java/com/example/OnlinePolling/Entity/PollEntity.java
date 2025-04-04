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
@Table(name="Poll1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PollEntity {    
	@Id
	@Column(name="sign_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sign_id;
	@Column(name="PollId")
	private String pid;
	@Column(name="Title")
	private String title;
	@Column(name="Description")
	private String desc;
	@Column(name="Created_By")
	private String created;
	@Column(name="Start_Time")
	private String stime;
	@Column(name="End_Time")
	private String etime;
	@Column(name="Status")
	private String status;
	@Column(name="Created_At")
	private String ctime;
	@Column(name="Updated_At")
	private String utime;
}