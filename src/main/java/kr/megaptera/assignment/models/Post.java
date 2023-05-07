package kr.megaptera.assignment.models;

public class Post {
    private PostId id;
    private PostTitle title;
    private String author; // domain entity change?
    private MultiLineText content;

    public Post(PostId id, PostTitle title, String author, MultiLineText content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public PostId id() {
        return id;
    }

    public PostTitle title() {
        return title;
    }

    public MultiLineText content() {
        return content;
    }

    public String author() {
        return author;
    }
}