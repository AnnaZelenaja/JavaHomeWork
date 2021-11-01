package com.pb.zelenaja.hm5;

public class Reader {

    private static int readerCount = 0;

    public static int getReaderCount() {
        return readerCount;
    }

    private String fio;
    private int number;
    private String faculty;
    private String dateBirth;
    private String phone;

    public Reader(String fio, int number, String faculty, String dateBirth, String phone) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phone = phone;
        readerCount++;
    }

    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги.");
        System.out.println();
    }

    public void takeBook(String... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (String book : books) {
            System.out.println("Название книги: " + book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println("Название книги: " + book.getName() + ", автор: " + book.getAuthor() + ", год издания:" + book.getYear());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println("Название книги: " + book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println("Название книги: " + book.getName() + ", автор: " + book.getAuthor() + ", год издания:" + book.getYear());
        }
        System.out.println();
    }

    public String getInfo() {
        return "[ФИО: " + fio + ", Номер читательcкого билета: " + number + ", Факультет: " + faculty
                + ", Дата рождения: " + dateBirth + ", номер телефона: " + phone + "]";

    }

}
