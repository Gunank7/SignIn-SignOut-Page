package com.homepage.api.serviceImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.api.models.Home;
import com.homepage.api.repository.HomeRepository;
import com.homepage.api.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeRepository repository;
	
	@Override
	public Home signIn() {
		Home home=new Home();
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		 System.out.println(dtf.format(now)); 
		 String currntTimeString=dtf.format(now);
		 home.setSignIn(currntTimeString);
		 
		 return repository.save(home);
	}

	
  public  Home signOut()
{
	  Home home=new Home();
	  DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now1 = LocalDateTime.now();  
		 System.out.println(dtf1.format(now1)); 
		 String currntTimeString1=dtf1.format(now1);
		 home.setSignOut(currntTimeString1);
		 
		 return repository.save(home);
}

}
