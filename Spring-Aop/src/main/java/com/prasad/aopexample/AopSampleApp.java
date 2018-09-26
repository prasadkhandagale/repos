package com.prasad.aopexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prasad.aopexample.business.BussinesService;

@SpringBootApplication
public class AopSampleApp  implements CommandLineRunner{

	@Autowired
	BussinesService bussinesService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AopSampleApp.class, args);
	}
// One of the use of command line runner is to run some logic as soon as the spring initializes
	@Override
	public void run(String... args) throws Exception {
		// write your in  it logic over here 
		bussinesService.getEmployeeName("prasad");
		
	}
}
