package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")
public class BookService {

    @Autowired
    private BookDAO bookDAO;  //빈 컨테이너에서 BookDAO 꺼냄. 필드 주입은 final 키워드를 못 붙임. 생성자 주입이 더 적절함.

    public List<BookDTO> findALlBooks() {
        return bookDAO.findALlBooks();
    }

    public BookDTO findBookBySeq(int seq) {
        return bookDAO.findBookBySeq(seq);
    }
}
