package Book_Library_System;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(215425,"network model ","grn-chang-lin");
        Book book1 = new Book(2514321,"Computer aided","j.s narang");

        book.displayBookDetails();

        book.setAuthor("Dr paras nath");
        System.out.println("updated auther name :- " + book.getAuthor());

        EBook eBook = new EBook(122548,"metal cutting" , " B.L Juneja" ,105);
        eBook.displayEBookDetails();


        eBook.displayEBookDetails();

    }
}
