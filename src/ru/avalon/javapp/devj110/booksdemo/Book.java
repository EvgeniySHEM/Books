package ru.avalon.javapp.devj110.booksdemo;

import java.util.Arrays;

public class Book {

    private String titleOfTheBook;
    private PublishingHouse publishingHouse;
    private int yearOfPublication;
    private String [] authors;

    public Book(String titleOfTheBook, int yearOfPublication, PublishingHouse publishingHouse) {
        setTitleOfTheBook(titleOfTheBook);
        setYearOfPublication(yearOfPublication);
        setPublishingHouse(publishingHouse);
    }

    public Book(String titleOfTheBook, int yearOfPublication, PublishingHouse publishingHouse, String ... authors) {
        this(titleOfTheBook, yearOfPublication, publishingHouse);
        setAuthors(authors);
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }

    public void setTitleOfTheBook(String titleOfTheBook) {
        if ( titleOfTheBook == null )
            throw new IllegalArgumentException("titleOfTheBook should not be an empty link");

        this.titleOfTheBook = titleOfTheBook;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        if ( publishingHouse == null )
            throw new IllegalArgumentException("publishingHouse should not be an empty link");

        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if ( yearOfPublication <= 0 )
            throw new IllegalArgumentException("The year of publication must be strictly greater than zero");

        this.yearOfPublication = yearOfPublication;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {

        for(String s : authors) {
            if (s == null)
                throw new IllegalArgumentException("The array authors must not contain empty references");
        }

        this.authors = authors;
    }

    //возвращает кол-во авторов книги
    public int getQuantityAuthors () {
        if ( authors == null )
            return 0;

        int quantity = authors.length;
        return quantity;
    }

    // возвращает автора с заданным индексом
    public String getNameAuthor(int number) {
        if ( number < 0 || authors != null && number > authors.length - 1)
            throw new IllegalArgumentException("The entered number exceeds the number of authors");

        if ( authors == null )
            return "The author is unknown.";
        else {
            String author = authors[number];
            return author;
        }
    }

    //    метод print, печатающий данные о книге
    public void print () {

        System.out.print("Название книги: " + titleOfTheBook);

        if ( authors != null )
            System.out.print("; Автор(ы): " + Arrays.toString(authors));

        System.out.println("; Издательство: " + publishingHouse +
                "; Год издания: " + yearOfPublication);
    }

    //    метод printAll, печатающий данные обо всех книгах заданного массива.
    public static void printAll(Book[] library) {

        for (Book el : library) {
            el.print();
        }
    }
}
