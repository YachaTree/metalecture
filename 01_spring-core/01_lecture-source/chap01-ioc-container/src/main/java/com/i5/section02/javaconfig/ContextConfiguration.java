package com.i5.section02.javaconfig;

import com.i5.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /* 해당 어노테이션은 클래스를 빈으로 인식하게함 */
public class ContextConfiguration {

    @Bean("member")
    public MemberDTO getMember() {
        System.out.println("getMember 호출함..................");
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }
}
