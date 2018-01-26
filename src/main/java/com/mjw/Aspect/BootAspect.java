package com.mjw.Aspect;

import com.alibaba.fastjson.JSON;
import com.mjw.controller.PersonController;
import com.sun.tools.javac.code.Attribute;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.thymeleaf.expression.Maps;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class BootAspect {


    @Pointcut("execution(* com.mjw.controller.*.*(..))")
    public void controllerPoint(){
    }


    @Before("controllerPoint()")
    public void doBefore(JoinPoint joinPoint){

        log("=======================Do  Pointcut  Before Begin=============================");

        //获取目标方法的参数信息
        /*Object[] obj = joinPoint.getArgs();
        log("args.length: " + obj.length);
        for (Object o : obj) {
            log(o);
        }*/

        //AOP代理类的信息
        /*Object aThis = joinPoint.getThis();
        PersonController pc = (PersonController) aThis;
        log(pc);
        //代理的目标对象
        Object target = joinPoint.getTarget();
        log(target);
        */

        //用的最多 通知的签名
        /*Signature signature = joinPoint.getSignature();
        log(signature.getName());
        log(signature.getDeclaringType());
        log(signature.getDeclaringTypeName());*/

        //获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            log("paramName: " + s + ", Value :" + request.getParameter(s));
        }


        log("=======================Do  Pointcut  Before End=============================");
    }


    public void log(Object object){
        System.out.println(object.toString());
    }
}
