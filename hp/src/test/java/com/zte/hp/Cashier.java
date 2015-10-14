package com.zte.hp;

import java.util.List;

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
public class Cashier {

    public Double calculation(ShoppingCart cart) {
        List<Book> books = cart.getBooks();
        int size = books.size();
        return 32 * size * getDiscount(size);
    }

    private double getDiscount(int size) {
        double discount = 1;
        if (size == 1)
            discount = 1;
        else if (size == 2)
            discount = 0.95;
        else if (size == 3)
            discount = 0.90;
        else if (size == 4)
            discount = 0.8;
        else
            discount = 0.75;
        return discount;
    }
}
