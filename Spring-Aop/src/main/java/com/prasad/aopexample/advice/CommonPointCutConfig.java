package com.prasad.aopexample.advice;

import org.aspectj.lang.annotation.Pointcut;

/**
 * This will have the list of point cuts defined in our application
 * if you want to use this ,just right click on method and copy qualified name and 
 * paste in your point cuts
 * @author prasad.k
 *
 */
public class CommonPointCutConfig {
	
	@Pointcut("execution(* com.prasad.aopexample.business.*.*(..))")
	public void businessLayerExecution(){
		
	}
	
	// list of layers point cuts  or any specify method point cuts 
   // as in our example we are doing this for business layer ,you can do this 
	// for data and different layers as well.
}
