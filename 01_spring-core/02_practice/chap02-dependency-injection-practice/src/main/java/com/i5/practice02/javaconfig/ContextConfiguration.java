package com.i5.practice02.javaconfig;

import com.i5.common.BoardDTO;
import com.i5.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO membergenerator() {
        MemberDTO member = new MemberDTO();
        member.setId(1L);
        member.setNickname("재협");
        return member;
    }

    @Bean
    public BoardDTO boardgenerator() {
        BoardDTO board = new BoardDTO();
        board.setId(1L);
        board.setTitle("제목1");
        board.setContent("내용1");
        board.setWriter(membergenerator());
        return board;
    }
}
