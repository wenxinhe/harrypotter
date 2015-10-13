package com.zte.hp;

public class Cart {
    private static final double UNIT_PRICE = 32.0;
    private static final double ONE_VOLUME_DISCOUNT = 1.0;
    private static final double TWO_VOLUME_DISCOUNT = 0.95;
    private static final double THREE_VOLUME_DISCOUNT = 0.9;
    private static final double FOUR_VOLUME_DISCOUNT = 0.8;
    public static final double WHOLE_HOG_DISCOUNT = 0.75;

    private Book[] books;

    public Cart(Book... books) {
        this.books = books;
    }

    public double cost() {
        switch (books.length) {
            case 1:
                return UNIT_PRICE * ONE_VOLUME_DISCOUNT;
            case 2:
                return UNIT_PRICE * 2 * TWO_VOLUME_DISCOUNT;
            case 3:
                return UNIT_PRICE * 3 * THREE_VOLUME_DISCOUNT;
            case 4:
                return UNIT_PRICE * 4 * FOUR_VOLUME_DISCOUNT;
            case 5:
                return UNIT_PRICE * 5 * WHOLE_HOG_DISCOUNT;
            default:
                throw new IllegalStateException();
        }

    }
}
