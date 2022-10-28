package com.homepage.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
   
	private String signIn;
   
	private String signOut;
}
