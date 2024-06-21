package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    private final BookDAO bookDAO;

    public List<BookDTO> findAllBOoks() {
        return bookDAO.findALlBooks();
    }

    public BookDTO findBookBySeq(int seq) {
        return bookDAO.findBookBySeq(seq);
    }

}
