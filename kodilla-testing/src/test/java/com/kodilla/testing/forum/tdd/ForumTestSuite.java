package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

public class ForumTestSuite {
    public static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test#:" + testCounter);
    }


    @Test //1

    @DisplayName("Tests for posts")

    void testAddPost() {
        //given
        ForumUser forumUser = new ForumUser("mrssmith", "John Smith");

        //when
        forumUser.addPost("mrssmith", "Hello everyone, this is my first contribution here!");

        //then
        Assertions.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test //2
    void testAddComment() {
        //given
        ForumUser forumUser = new ForumUser("mrssmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone,this is my first contribution here", "mrssmith");

        //when
        forumUser.addComment(thePost, "mrssmith", "Thank you for all good words!" );

        //then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test //3
    void testGetPost() {
        //given
        ForumUser forumUser = new ForumUser("mrssmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone" + "this is my first contribution here", "mrssmith");

        //when
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

        //then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test //4
            void testGetComment() {
    //given
    ForumUser forumUser = new ForumUser("mrssmith", "John Smith");
    ForumPost thePost = new ForumPost("Hello everyone" + "this is my first contribution here", "mrssmith");
    ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrssmith");
    forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

    //when
    ForumComment retrievedComment = forumUser.getComment(0);

    //then
    Assertions.assertEquals(theComment, retrievedComment);
    }

    @Test //5
    void testRemovePostNonExisting() {
        //given
        ForumUser forumUser = new ForumUser("mrssmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone" + "this is my first contribution here", "mrssmith");

        //when
        boolean result = forumUser.removePost(thePost);

        //then
        Assertions.assertFalse(result);
    }

    @Test //6
    void testRemoveCommentNonExisting() {
        //given
        ForumUser forumUser = new ForumUser("mrssmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone" + "this is my first contribution here", "mrssmith");
        ForumComment theComment = new ForumComment(thePost, "Thank ju i takie tam", "mrssmith");

        //when
    boolean result = forumUser.removeCommment(theComment);

    //then
    Assertions.assertFalse(result);
    }

    @Test //7
    void testRemovePost() {
        //given
        ForumUser forumUser = new ForumUser("mrssmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone" + "this is my first contribution here", "mrssmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //when
        boolean result = forumUser.removePost(thePost);

        // then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test //8
    void testRemoveCommment() {
        //given
        ForumUser forumUser = new ForumUser("mrssmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone" + "this is my first contribution here", "mrssmith");
        ForumComment theComment = new ForumComment(thePost, "Thankyou for all good words!", "mrssmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //when
        boolean result = forumUser.removeCommment(theComment);

        //then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }

}
