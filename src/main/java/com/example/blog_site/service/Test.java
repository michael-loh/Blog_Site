package com.example.blog_site.service;

import com.example.blog_site.model.Blog;
import com.example.blog_site.model.User;

public class Test {

    public static DB database(){
        DB database = new DB();

        User u1 = new User("user1","user1@gmail.com","password1");
        User u2 = new User("user2","user2@gmail.com","password2");
        User u3 = new User("user3","user3@gmail.com","password3");
        User u4 = new User("user4","user4@gmail.com","password4");
        User u5 = new User("user5","user5@gmail.com","password5");
        User u6 = new User("user6","user6@gmail.com","password6");
        User u7 = new User("user7","user7@gmail.com","password7");
        User u8 = new User("user8","user8@gmail.com","password8");
        User u9 = new User("user9","user9@gmail.com","password9");
        User u10 = new User("user10","user10@gmail.com","password10");

        Blog b1 = new Blog(1, u1,"Blog 1", "" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem " +
                "Ipsum has been the industry's standard dummy text ever since the 1500s, when an " +
                "unknown printer took a galley of type and scrambled it to make a type specimen book.");
        Blog b2 = new Blog(2, u2,"Blog 2", "" +
                "It has survived not only five centuries, but also the leap into electronic typesetting," +
                " remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing" +
                " software like Aldus PageMaker including versions of Lorem Ipsum.");
        Blog b3 = new Blog(3, u3, "Blog 3", "" +
                "It is a long established fact that a reader will be distracted by the readable content" +
                " of a page when looking at its layout.");
        Blog b4 = new Blog(4, u4, "Blog 4","" +
                "The point of using Lorem Ipsum is that it has a more-or-less normal distribution " +
                "of letters, as opposed to using 'Content here, content here', making it look like " +
                "readable English.");
        Blog b5 = new Blog(5, u5, "Blog 5","" +
                "Many desktop publishing packages and web page editors now use Lorem Ipsum as their " +
                "default model text, and a search for 'lorem ipsum' will uncover many web sites still in t" +
                "heir infancy. Various versions have evolved over the years, sometimes by accident, sometimes" +
                " on purpose (injected humour and the like).");
        Blog b6 = new Blog(6, u6, "Blog 6","" +
                "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece" +
                " of classical Latin literature from 45 BC, making it over 2000 years old.");
        Blog b7 = new Blog(7, u7, "Blog 7","" +
                "Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one" +
                " of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through" +
                " the cites of the word in classical literature, discovered the undoubtable source.");
        Blog b8 = new Blog(8, u8, "Blog 8","" +
                "Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" " +
                "(The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the " +
                "theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem" +
                " ipsum dolor sit amet..\", comes from a line in section 1.10.32.");
        Blog b9 = new Blog(9, u9, "Blog 9","" +
                "There are many variations of passages of Lorem Ipsum available, but the majority have " +
                "suffered alteration in some form, by injected humour, or randomised words which don't " +
                "look even slightly believable.");
        Blog b10 = new Blog(10, u10, "Blog 10","" +
                "If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything" +
                " embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend" +
                " to repeat predefined chunks as necessary, making this the first true generator on the Internet.");

        database.addUsers(u1);
        database.addUsers(u2);
        database.addUsers(u3);
        database.addUsers(u4);
        database.addUsers(u5);
        database.addUsers(u6);
        database.addUsers(u7);
        database.addUsers(u8);
        database.addUsers(u9);
        database.addUsers(u10);

        database.addBlog(b1);
        database.addBlog(b2);
        database.addBlog(b3);
        database.addBlog(b4);
        database.addBlog(b5);
        database.addBlog(b6);
        database.addBlog(b7);
        database.addBlog(b8);
        database.addBlog(b9);
        database.addBlog(b10);

        return database;
    }
}
