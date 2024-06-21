package com.i5.practice02.javaconfig;

import com.i5.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        BoardDTO boardDTO = context.getBean(BoardDTO.class);

        System.out.println("boardDTO = " + boardDTO);
    }
}
