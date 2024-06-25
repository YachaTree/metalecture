package com.i5.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.i5.section01.aop");

        MemberService memberService = (MemberService) context.getBean("memberService");

        System.out.println("findAllMembers =========================");
        System.out.println(memberService.findMembers());
    }

}
