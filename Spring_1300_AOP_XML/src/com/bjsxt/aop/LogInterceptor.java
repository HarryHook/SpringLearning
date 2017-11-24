package com.bjsxt.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {

//    @Pointcut("execution(public * com.bjsxt.dao..*.*(..))")
    public void myMethod() {
    }

//    @Before("myMethod()")
    public void before() {
        System.out.println("method start");
    }

//    @Around("myMethod()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("method around start");
        pjp.proceed();
        System.out.println("method around end");

    }
}
