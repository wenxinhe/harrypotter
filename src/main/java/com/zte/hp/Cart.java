package com.zte.hp;

public class Cart {
    private static final double UNIT_PRICE = 32.0;
    private static final double TWO_VOLUME_DISCOUNT = 0.95;
    private static final double ONE_VOLUME_DISCOUNT = 1.0;

    private Book[] books;

    public Cart(Book... books) {
        this.books = books;
    }

    public double cost() {
        return books.length == 1 ? UNIT_PRICE * ONE_VOLUME_DISCOUNT : UNIT_PRICE * 2 * TWO_VOLUME_DISCOUNT;
    }
}
