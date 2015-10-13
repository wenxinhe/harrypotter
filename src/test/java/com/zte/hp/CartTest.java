package com.zte.hp;

import org.junit.Test;

import static com.zte.hp.Volume.I;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CartTest {
    @Test
    public void should_cost_32_rmb_when_buy_one_book() throws Exception {
        double total = new Cart(new Book(I)).cost();
        assertThat(total, equalTo(32.0));
    }
}
