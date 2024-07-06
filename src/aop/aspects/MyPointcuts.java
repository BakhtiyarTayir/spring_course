package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}
