package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //given
        Book book1 = new Book("Blady król", "D.F. Wallace", LocalDate.of(2010,05,03));
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", LocalDate.of(1954,06,27));
        Book book3 = new Book ("Hobbit", "J.R.R. Tolkien",LocalDate.of(1937, 12,9));

        Set<Book> books= new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library library = new Library("Epic Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);


        //shallow clone of library object
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Epic Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep clone of library object
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Epic Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }




        //when & then
        library.getBooks().size();

        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepCloneLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepCloneLibrary.getBooks().size());
        assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());









    }
}
