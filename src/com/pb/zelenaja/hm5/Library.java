package com.pb.zelenaja.hm5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов Б.А.", 1260, "физический", "08.02.1989", "380677777");
        Reader reader2 = new Reader("Петров А.В.", 1150, "юридический", "25.10.1988", "3809722222");
        Reader reader3 = new Reader("Ильин В.М.", 1402, "филологический", "17.12.1987", "3809833333");
        Reader reader4 = new Reader("Смирнов И.О.", 1687, "математический", "18.03.1991", "3809892922");
        Reader reader5 = new Reader("Углов Т.П.", 492, "физический", "31.05.1989", "3809247474");
        Reader[] readers = {reader1, reader2, reader3, reader4, reader5};

        Book book1 = new Book("Приключения капитана Врунгеля", "Некрасов А.С.", 1990);
        Book book2 = new Book("Толковый словарь Даля", "Даль В.И.", 2010);
        Book book3 = new Book("Энциклопедия астрономии", "Аксенова М.Д.", 2000);
        Book book4 = new Book("Солярис", "Лем С.", 1994);
        Book book5 = new Book("Три мушкетёра", "Дюма А.", 2015);
        Book[] books = {book1, book2, book3, book4, book5};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader2.takeBook("Приключения капитана Врунгеля", "Толковый словарь Даля", "Энциклопедия астрономии");
        reader3.takeBook(book1, book4, book5);

        reader1.returnBook(1);
        reader4.returnBook("Приключения капитана Врунгеля", "Толковый словарь Даля", "Энциклопедия астрономии");
        reader5.returnBook(book2);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
