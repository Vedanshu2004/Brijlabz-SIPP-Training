package Book_Library_System;

public class Book {
    public long ISBN;
    protected String title;
    private String author;

    public Book(long ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public  String getAuthor(){
        return author;

    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void displayBookDetails(){
        System.out.println("ISBN :- "+ISBN);
        System.out.println("Title :- "+title);
        System.out.println("Author :-"+author);
    }
}
