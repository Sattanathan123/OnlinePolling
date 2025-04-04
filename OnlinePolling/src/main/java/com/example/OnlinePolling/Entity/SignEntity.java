package com.example.OnlinePolling.Entity;
import java.util.List;

import com.example.EmailConnectivity.Entity.StudentEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="Signup1")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignEntity {
    @Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	@Column(name="username")
	private String user;
	@Column(name="password")
	private String pwd;
	@Column(name="email")
	private String mail;
	@Column(name="PhoneNo")
	private String phone;
	@Column(name="role")
	private String role;
	@Column(name="gender")
	private String gender;
	@Column(name="address")
	private String add;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private List<PollEntity> poll;
}
