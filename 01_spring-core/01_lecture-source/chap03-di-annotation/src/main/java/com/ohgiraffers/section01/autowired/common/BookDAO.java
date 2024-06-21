package com.ohgiraffers.section01.autowired.common;

import java.util.List;

public interface BookDAO {


    List<BookDTO> findALlBooks();

    BookDTO findBookBySeq(int seq);
}
