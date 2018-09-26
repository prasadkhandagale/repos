package com.prasad.aopexample.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasad.aopexample.respository.DataRepository;

@Service
public class BussinesService {
	
	@Autowired
	private DataRepository dataRepository;
	
	public String getEmployeeName(String id){
		return dataRepository.getEmpNameBYId(id);
	}

}
