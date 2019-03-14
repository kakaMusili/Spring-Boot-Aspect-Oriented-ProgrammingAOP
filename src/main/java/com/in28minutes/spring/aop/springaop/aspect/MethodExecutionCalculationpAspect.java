package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect //aspect
public class MethodExecutionCalculationpAspect {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Around("com.in28minutes.spring.aop.springaop.aspect.CommonJointPointConfig.trackTimeAnnotation()")
     //pointcut
    public  void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime=System.currentTimeMillis();

        joinPoint.proceed();

        long timeTaken=System.currentTimeMillis()-startTime;
            //advice

        logger.info(" time taken by {} is  {}", joinPoint,timeTaken);
    }
}
