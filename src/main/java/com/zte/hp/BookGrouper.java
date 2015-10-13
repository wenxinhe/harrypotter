package com.zte.hp;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * vincent on 15-10-13.
 */
public class BookGrouper {

    public BookGroup[] group(List<Book> _books) {
        List<Book> books = newArrayList(_books);
        List<BookGroup> groups = newArrayList();
        while (books.size() > 0) {
            groups.add(new VolumeSelector().select(books));
        }
        return groups.toArray(new BookGroup[0]);
    }
}
