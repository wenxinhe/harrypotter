package com.zte.hp;

public class Cart {
    private Book book;

    public Cart(Book book) {
        this.book = book;
    }

    public double cost() {
        return book.getPrice();
    }
}
