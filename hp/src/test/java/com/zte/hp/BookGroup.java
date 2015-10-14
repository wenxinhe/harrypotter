package com.zte.hp;

import java.util.List;

public class BookGroup {

    private List<Book> books;
    private double percent;

    public BookGroup(List<Book> books, double percent) {
        this.percent = percent;
        this.books = books;
    }

    public double getPrice() {
        return percent * 32 * books.size();
    }
}
