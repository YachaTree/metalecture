package com.ohgiraffers.section01.autowired.common;

import java.util.Date;

public class BookDTO {
    private int seq;
    private int id;
    private String author;
    private String title;
    private String publisher;
    private Date date;

    public BookDTO() {}

    public BookDTO(int seq, int id, String author, String title, String publisher, Date date) {
        this.seq = seq;
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.date = date;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "seq=" + seq +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", date=" + date +
                '}';
    }
}
