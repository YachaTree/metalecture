package com.i5.section01.xmlconfig;

import com.i5.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

//        MemberDTO member = (MemberDTO) context.getBean("member");  /* 객체명과 일치하는것을 꺼내옴. */
//        MemberDTO member = context.getBean(MemberDTO.class); // 해당 타입과 일치하는것을 꺼내옴.
        MemberDTO member = context.getBean("member", MemberDTO.class); //위 둘을 혼합해서 일치하는것을 꺼내줌
        System.out.println("member = " + member);
    }

   
}
