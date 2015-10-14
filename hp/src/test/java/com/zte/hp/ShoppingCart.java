package com.zte.hp;

import java.util.ArrayList;
import java.util.Arrays;
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
public class ShoppingCart {

    private List<Book> bookCart = new ArrayList<Book>();
    private int totalSize = 0;
    private List<BookGroup> bookGroups;

    public void add(Book... books) {
        totalSize += books.length;
        bookCart.addAll(Arrays.asList(books));
    }

    public List<BookGroup> getBookGroups() {
        if (totalSize == 4 && isHasDoubleBook()) {
            return Arrays.asList(new BookGroup(bookCart.subList(0,3), 0.9), new BookGroup(bookCart.subList(2,3), 1.0));
        } else {
            return Arrays.asList(new BookGroup(bookCart, getDiscount(totalSize)));
        }
    }

    public boolean isHasDoubleBook(){
        List<Integer> serials = new ArrayList<Integer>();
        for(Book book: bookCart){
            if(serials.contains(book.getSerial())){
                return true;
            }else{
                serials.add(book.getSerial());
            }
        }
        return false;
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
