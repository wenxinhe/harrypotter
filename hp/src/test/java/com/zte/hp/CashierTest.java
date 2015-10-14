package com.zte.hp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * <p><owner>10087558</owner> </p>
 * <p><createdate>2015-10-14</createdate></p>
 * <p/>
 * <p>版权所有: 版权所有(C)2001-2020</p>
 * <p>公司名称: 深圳市中兴通讯股份有限公司</p>
 *
 * @author 10087558
 * @version 1.0
 */
public class CashierTest {

    @Test
    public void should_get_price_100_percent_when_reader_buy_one_book() {

        // given
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Book());

        Cashier cashier = new Cashier();

        // when
        Double price = cashier.calculation(cart);

        // then
        assertThat(price, is(32d));

    }

    @Test
    public void should_get_price_95_percent_when_reader_buy_two_book() {

        // given
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Book());
        cart.add(new Book());

        Cashier cashier = new Cashier();

        // when
        Double result = cashier.calculation(cart);

        // then
        assertThat(result, is(60.8d));
    }

}
