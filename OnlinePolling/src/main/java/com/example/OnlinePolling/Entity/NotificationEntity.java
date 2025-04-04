package com.example.OnlinePolling.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="email_log")
public class NotificationEntity {
          @Id
          @GeneratedValue(strategy=GenerationType.IDENTITY)
          @Column(name="Id")
          private int id;
          @Column(name="receiver")
          private String rmail;
          @Column(name="Subject")
          private String sub;
          @Column(name="Message")
          private String msg;
}
