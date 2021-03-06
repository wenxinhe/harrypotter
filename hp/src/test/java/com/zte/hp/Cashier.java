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
        double price = 0.0;
        for(BookGroup group: cart.getBookGroups()){
            price += group.getPrice();
        }
        return price;
    }

}
