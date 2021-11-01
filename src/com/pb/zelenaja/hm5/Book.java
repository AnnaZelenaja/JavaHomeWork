package com.pb.zelenaja.hm5;

public class Book {

    private static int bookCount = 0;

    public static int getBookCount() {
        return bookCount;
    }

    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        bookCount++;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void getYear(int year) {
        this.year = year;
    }

    public String getInfo() {
        return "[Название: " + name + ", автор: " + author + ", Год издания:" + year + "]";
    }
}
