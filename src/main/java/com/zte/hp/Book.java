package com.zte.hp;
/**
 *  vincent on 15-10-13.
 */
public class Book {

    private final Volume volume;

    public Book(Volume volume) {
        this.volume = volume;
    }

    public Volume getVolume() {
        return volume;
    }
}
