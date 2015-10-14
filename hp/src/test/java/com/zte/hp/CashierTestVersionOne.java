package com.zte.hp;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CashierTestVersionOne {


    private ShoppingCart cart;
    private Cashier cashier;

    @Before
    public void setUp() {
        cart = new ShoppingCart();
        cart.setRule(new PericeRuleVersion1());
        cashier = new Cashier();
    }

    @Test
    public void should_get_price_100_percent_when_reader_buy_one_book() {
        // given
        cart.add(new Book(1, 32));

        // when
        Double price = cashier.calculation(cart);

        // then
        assertThat(price, is(32d));
    }

    @Test
    public void should_get_price_95_percent_when_reader_buy_two_book() {
        // given
        cart.add(new Book(1, 32), new Book(2, 32));

        // when
        Double result = cashier.calculation(cart);

        // then
        assertThat(result, is(60.8));
    }

    @Test
    public void should_get_price_90_percent_when_reader_buy_three_book() {
        // given
        cart.add(new Book(1, 32), new Book(2, 32), new Book(3, 32));

        // when
        Double result = cashier.calculation(cart);

        // then
        assertThat(result, is(86.4));
    }

    @Test
    public void should_get_price_80_percent_when_reader_buy_four_book() {
        // given
        cart.add(new Book(1, 32), new Book(2, 32), new Book(3, 32), new Book(4, 32));

        // when
        Double result = cashier.calculation(cart);

        // then
        assertThat(result, is(102.4));
    }

    @Test
    public void should_get_price_75_percent_when_reader_buy_five_book() {
        // given
        cart.add(new Book(1, 32), new Book(2, 32), new Book(3, 32), new Book(4, 32), new Book(5, 32));

        // when
        Double result = cashier.calculation(cart);

        // then
        assertThat(result, is(120d));
    }

    @Test
    public void should_get_75_percent_with_three_and_100_percent_with_one_when_reader_buy_four_book_and_two_book_a_same() {
        // given
        cart.add(new Book(1, 32), new Book(2, 32), new Book(3, 32), new Book(3, 32));

        // when
        Double result = cashier.calculation(cart);

        // then
        assertThat(result, is(118.4));
    }

    @Test
    public void should_get_lower_price_when_reader_buy_echo_of_serial1_serial2_serial3_double_and_one_serial4_one_serial5() {

        // given
        cart.add(
                new Book(1, 32), new Book(1, 32),
                new Book(2, 32), new Book(2, 32),
                new Book(3, 32), new Book(3, 32),
                new Book(4, 32),
                new Book(5, 32));

        // when
        Double result = cashier.calculation(cart);

        // then
        assertThat(result, is(204.8));

    }

}
