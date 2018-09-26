package com.prasad.aopexample.respository;

import org.springframework.stereotype.Repository;

@Repository
public class DataRepository {
	
	public String getEmpNameBYId(String id){
		return "Employee"+id;
	}

}
