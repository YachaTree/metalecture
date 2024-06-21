package com.i5.practice01.xmlconfig;

import com.i5.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =new GenericXmlApplicationContext("com/i5/practice01/xmlconfig/spring-context.xml");

        BoardDTO board = context.getBean("board", BoardDTO.class);
        System.out.println("board = " + board);
        
    }
}
