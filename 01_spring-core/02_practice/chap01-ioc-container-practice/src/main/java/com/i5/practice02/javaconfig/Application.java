package com.i5.practice02.javaconfig;

import com.i5.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        BoardDTO board = context.getBean("board",BoardDTO.class);

        System.out.println("board = " + board);
    }
}
