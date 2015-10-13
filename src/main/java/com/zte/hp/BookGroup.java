package com.zte.hp;

import com.google.common.collect.Lists;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * vincent on 15-10-13.
 */
public class BookGroup {
    private Book[] books;

    public BookGroup(Book... books) {
        this.books = books;
    }

    public int getBookCount() {
        return books.length;
    }
}
