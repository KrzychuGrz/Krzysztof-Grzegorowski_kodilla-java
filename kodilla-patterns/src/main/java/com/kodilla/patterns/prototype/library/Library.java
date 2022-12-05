package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library extends Prototype<Library> {

    String name;
    public Set<Book> books = new HashSet<>();
    public Library library;

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                ", library=" + library +
                '}';
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book collection : books) {
            Book clonedBooks = new Book(collection.getTitle(), collection.getAuthor(), collection.getPublicationDate());
        }
        return clonedLibrary;

    }


//    public Board shallowCopy() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    public Board deepCopy() throws CloneNotSupportedException {
//        Board clonedBoard = super.clone();
//        clonedBoard.lists = new HashSet<>();
//        for (TasksList theList : lists) {
//            TasksList clonedList = new TasksList(theList.getName());
//            for (Task task : theList.getTasks()) {
//                clonedList.getTasks().add(task);
//            }
//            clonedBoard.getLists().add(clonedList);
//        }
//        return clonedBoard;
}
