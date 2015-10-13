package com.zte.hp;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.zte.hp.Volume.I;
import static com.zte.hp.Volume.II;
import static com.zte.hp.Volume.III;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * vincent on 15-10-13.
 */
public class BookGroupTest {

    private BookGrouper grouper = new BookGrouper();

    @Test
    public void should_return_two_group_when_four_books_have_two_same() throws Exception {
        List<Book> fourBooksButTwoSame = newArrayList(new Book(I), new Book(II), new Book(III), new Book(III));
        BookGroup[] bookGroups = grouper.group(fourBooksButTwoSame);

        assertThat(bookGroups.length, is(2));
        assertThat(bookGroups[0].getBookCount(), is(3));
        assertThat(bookGroups[1].getBookCount(), is(1));

    }
}