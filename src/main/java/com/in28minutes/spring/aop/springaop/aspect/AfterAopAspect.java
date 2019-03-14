package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect //aspect
public class AfterAopAspect {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @AfterReturning( value = "com.in28minutes.spring.aop.springaop.aspect.CommonJointPointConfig.businessLayerExecution()",
    returning = "result")   //pointcut
    public  void after(JoinPoint joinPoint, Object result)
    {
            //advice

        logger.info("{} return with value  {}", joinPoint,result);
    }
}
