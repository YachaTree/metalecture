package com.i5.practice02.javaconfig;

import com.i5.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("board")
    public BoardDTO getBoard() {
        System.out.println("getBoard 호출함...............");
        return new BoardDTO(1L, "제목1", "내용1", "작가1");
    }
}
