package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01"); //베이스 설정파일 없을때

        BookService bookService = (BookService) context.getBean("bookServiceField");

        bookService.findALlBooks().forEach(System.out::println);

    }
}
