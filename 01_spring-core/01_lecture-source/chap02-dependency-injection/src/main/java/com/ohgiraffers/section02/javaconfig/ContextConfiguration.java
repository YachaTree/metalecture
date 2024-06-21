package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.Member;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {

        return new PersonalAccount(03, "1234456-78-78945612");
    }

    @Bean
    public Member memberGenerator() {

        /* 1. 생정자 주입 */
//        return new Member(1, "김재협", "010-6456-3138", "woguq@naver.com", accountGenerator());

        /* 2. setter 주입 */
        Member member = new Member();
        member.setSequence(1);
        member.setName("김재협");
        member.setEmail("woguq@naver.com");
        member.setPhone("010-6456-3138");
        member.setPersonalAccount(accountGenerator());

        return member;
    }

}
