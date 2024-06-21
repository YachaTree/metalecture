package com.i5.practice01.xmlconfig;

import com.i5.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("com/i5/practice01/xmlconfig/spring-context.xml");

        BoardDTO boardDTO = context.getBean("boardDTO",BoardDTO.class);

        System.out.println("boardDTO = " + boardDTO);;
    }
}
