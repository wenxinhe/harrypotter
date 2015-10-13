package com.zte.hp;

import org.junit.Test;

import static com.zte.hp.Volume.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CartTest {
    @Test
    public void should_get_no_discount_when_buy_ONE_book() throws Exception {
        double total = new Cart(new Book(I)).cost();
        assertThat(total, equalTo(32.0));
    }

    @Test
    public void should_get_5_percent_discount_when_buy_TWO_different_books() throws Exception {
        double total = new Cart(new Book(I), new Book(II)).cost();
        assertThat(total, equalTo(32.0 * 2 * 0.95));
    }

    @Test
    public void should_get_10_percent_discount_when_buy_THREE_different_books() throws Exception {
        double total = new Cart(new Book(I), new Book(II), new Book(III)).cost();
        assertThat(total, equalTo(32.0 * 3 * 0.9));
    }

    @Test
    public void should_get_20_percent_discount_when_buy_FOUR_different_books() throws Exception {
        double total = new Cart(new Book(I), new Book(II), new Book(III), new Book(IV)).cost();
        assertThat(total, equalTo(32.0 * 4 * 0.8));
    }

    @Test
    public void should_get_25_percent_discount_when_go_WHOLE_hog() throws Exception {
        double total = new Cart(new Book(I), new Book(II), new Book(III), new Book(IV), new Book(V)).cost();
        assertThat(total, equalTo(32.0 * 5 * 0.75));
    }
}
