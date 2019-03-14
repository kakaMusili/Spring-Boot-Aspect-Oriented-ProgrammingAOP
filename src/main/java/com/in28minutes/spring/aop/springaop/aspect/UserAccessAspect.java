package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect //aspect
public class UserAccessAspect {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

@Before("com.in28minutes.spring.aop.springaop.aspect.CommonJointPointConfig.dataLayerExecution()")   //pointcut
    public  void before(JoinPoint joinPoint)
    {
            //advice
        logger.info("checking user access");
        logger.info("the following method would be executed - {}", joinPoint);
    }
}
