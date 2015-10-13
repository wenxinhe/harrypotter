package com.zte.hp;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * vincent on 15-10-13.
 */
public class VolumeSelector {

    private Set<Volume> volumes = Sets.newHashSet();

    public BookGroup select(List<Book> books) {
        List<Book> group = Lists.newArrayList();

        ListIterator<Book> iterator = books.listIterator();
        while (iterator.hasNext()) {
            Book book =  iterator.next();
            if (volumes.add(book.getVolume())) {
                group.add(book);
                iterator.remove();
            }
        }

        return new BookGroup(group.toArray(new Book[0]));
    }
}
