package com.prasad.aopexample.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
@Configuration
public class PointCutManager {
	
	private Logger logger = LoggerFactory.getLogger(getClass().getName());
	
	
	// PointCut
	@Before(value = "com.prasad.aopexample.advice.CommonPointCutConfig.businessLayerExecution()") // sample execution(* PACAKGE.*.*(..))
	public void before(JoinPoint joinpoint){
		// Advice
		logger.info("Intercepted method calls with input -{}",joinpoint);
	}
	
	// Combination of point cut and advice is called as AOP
	@AfterReturning(value = "execution(* com.prasad.aopexample.business.*.*(..))",returning="result") // sample execution(* PACAKGE.*.*(..))
	public void after(JoinPoint joinpoint,Object result){
		// Advice
		logger.info("Retururning method  with input -{} and result {}",joinpoint,result);
	}
	
	/**
	 * ProceedingJoin point intercepts the method,proceeds the execution of the method
	 * and control comes again in this around method(This will be useful to calculate the time taken
	 * by any method)
	 * @param joinPoint
	 * @throws Throwable 
	 */
	@Around(value="execution(* com.prasad.aopexample.business.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {} ,is {}",joinPoint,timeTaken);
	}
	
}
