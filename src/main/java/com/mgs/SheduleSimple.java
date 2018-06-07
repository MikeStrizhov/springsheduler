package com.mgs;
import  org.springframework.context.support.GenericXmlApplicationContext;

public class SheduleSimple {
    public static  void  main  (String  []  args)  {
        GenericXmlApplicationContext  ctx  =  new  GenericXmlApplicationContext();
        ctx.load("classpath:/spring/task-namespace-app-context.xml");
        ctx.refresh ()  ;
        while (true) {
        }
    }
}
