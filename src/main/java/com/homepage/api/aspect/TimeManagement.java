package com.homepage.api.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class TimeManagement {



	Logger logger = LoggerFactory.getLogger(TimeManagement.class);

	@Around("@annotation(com.homepage.api.advice.TimeExecutionAdvisor)")
	public Object trackTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object obj = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		logger.info("Method name... " + joinPoint.getSignature() + " Time taken to execute..." + (endTime - startTime));
		return obj;
	}
}
