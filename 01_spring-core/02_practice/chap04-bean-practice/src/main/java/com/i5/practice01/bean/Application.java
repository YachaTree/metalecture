package com.i5.practice01.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        SingletonBean singletonBean = context.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);

        System.out.println(singletonBean.getMessage());
        System.out.println(singletonBean2.getMessage());
        System.out.println(prototypeBean.getMessage());
        System.out.println(prototypeBean2.getMessage());

        ((AnnotationConfigApplicationContext) context).close();

    }
}
