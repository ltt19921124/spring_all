package com.msb.bean;

public class Book {

    private String bname;
    private String author;

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public Book() {
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
