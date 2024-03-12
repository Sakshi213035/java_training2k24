import java.util.ArrayList;

public class bbokdetail {
    public static void main(String[] args) {
        ArrayList<Book>books=new ArrayList<>();
        books.add(new Book(1,"C PROGRAMMING","AUTHOR A.R."));
        books.add(new Book(2,"C++ PROGRAMMING","AUTHOR A.K."));
        books.add(new Book(3,"C# PROGRAMMING","AUTHOR A.J."));
        books.add(new Book(4,"JAVA PROGRAMMING","AUTHOR A.W."));

        System.out.println("Book Details");
        for(Book book:books){
            System.out.println("BookId: "+book.getBookid());
            System.out.println("BookName: "+book.getBookname());
            System.out.println("AuthorName: "+book.getAuthorname());


        }
    }
}
