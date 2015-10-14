package com.zte.hp;

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
public class Book {

    private int serial;
    private double price;

    public Book(int serial, double price) {
        this.serial = serial;
        this.price = price;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
