package com.bjsxt.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogIntercept implements InvocationHandler {
    private Object target;  //要代理的那个对象

    public void beforeMethod(Method m) {
        System.out.println(m.getName() + "...start");
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(method);
        method.invoke(target, args);

        return null;
    }
}
