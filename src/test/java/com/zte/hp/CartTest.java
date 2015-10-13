package com.zte.hp;

import org.junit.Test;

import static com.zte.hp.Volume.I;
import static com.zte.hp.Volume.II;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CartTest {
    @Test
    public void should_get_no_discount_when_buy_one_book() throws Exception {
        double total = new Cart(new Book(I)).cost();
        assertThat(total, equalTo(32.0));
    }

    @Test
    public void should_get_5_percent_discount_when_buy_two_different_books() throws Exception {
        double total = new Cart(new Book(I), new Book(II)).cost();
        assertThat(total, equalTo(32.0 * 2 * 0.95));
    }


}
