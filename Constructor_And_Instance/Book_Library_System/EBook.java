package Book_Library_System;

public class EBook extends Book{

    double filesizeMB;
    public EBook(long ISBN, String title, String author,double filesizeMB) {
        super(ISBN, title, author);
        this.filesizeMB = filesizeMB;
    }

    public void displayEBookDetails(){
        System.out.println("E-Book ISBN :- "+ISBN);
        System.out.println("Title :- "+title);
        System.out.println("File size is :- "+ filesizeMB );
    }
}
