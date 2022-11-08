package com.kodilla.stream.forumuser;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main (String [] args) {
        Forum forum = new Forum();
        Map<String,ForumUser> theResultMapOfForumUser = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.of(2002,01,01)))
                .filter(forumUser -> forumUser.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey())
                .forEach(System.out::println);


//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(", \n"," <<",">>"));
//
//                System.out.println(theResultStringOfBooks);

    }
}
