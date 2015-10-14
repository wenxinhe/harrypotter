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
        if (size == 1)
            return 32d;
        else if(size == 2)
            return 32 * size * 0.95;
        else if(size == 3)
            return 32 * size * 0.90;
        else
            return 32 * size * 0.8;
    }
}
