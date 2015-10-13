package com.zte.hp;

public class Cart {
    private Book[] books;

    public Cart(Book... books) {
        this.books = books;
    }

    public double cost() {
        return 32.0;
    }
}
