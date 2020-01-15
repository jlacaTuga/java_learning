package app;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1=new Comment("Have a nice trip");
        Comment comment2=new Comment("Wow, that's awsome");
        Post post1=new Post(sdf.parse("21/06/2018 13:06:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country", 12);
        post1.addComent(comment1);
        post1.addComent(comment2);

        System.out.println(post1);
    }
}
