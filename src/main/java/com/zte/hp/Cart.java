package com.zte.hp;

import com.google.common.collect.Lists;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Cart {
    private static final double UNIT_PRICE = 32.0;
    private static final double ONE_VOLUME_DISCOUNT = 1.0;
    private static final double TWO_VOLUME_DISCOUNT = 0.95;
    private static final double THREE_VOLUME_DISCOUNT = 0.9;
    private static final double FOUR_VOLUME_DISCOUNT = 0.8;
    private static final double WHOLE_HOG_DISCOUNT = 0.75;

    private final BookGrouper bookGrouper;
    private List<Book> books;

    public Cart(Book... books) {
        this.books = newArrayList(books);
        bookGrouper = new BookGrouper();
    }

    public double cost() {
        BookGroup[] bookGroups = bookGrouper.group(books);
        double cost = 0.0;
        for (BookGroup bookGroup : bookGroups) {
            cost += groupCost(bookGroup.getBookCount());
        }
        return cost;
    }

    private double groupCost(int count) {
        switch (count) {
            case 0:
                return 0.0;
            case 1:
                return UNIT_PRICE * ONE_VOLUME_DISCOUNT;
            case 2:
                return UNIT_PRICE * count * TWO_VOLUME_DISCOUNT;
            case 3:
                return UNIT_PRICE * count * THREE_VOLUME_DISCOUNT;
            case 4:
                return UNIT_PRICE * count * FOUR_VOLUME_DISCOUNT;
            case 5:
                return UNIT_PRICE * count * WHOLE_HOG_DISCOUNT;
            default:
                throw new IllegalStateException();

        }
    }
}
