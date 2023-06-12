import java.util.ArrayList;
import java.util.HashMap;

public class Library {
/*Implement methods in the "Library" class to perform operations like adding books, adding borrowers, checking out books, and returning books.
Ensure that the necessary validations are implemented, such as checking if a book is available before allowing it to be borrowed. */

    private HashMap<Borrower, Book> borrowers = new HashMap<>();
    private  ArrayList<Book> books = new ArrayList<>();

    //Check if book is available in the library
    public boolean isAvailable(Book book){
        return books.contains(book);
    }

    public boolean isAvailable(String Tittle){
        for (Book dummy : books) {
            if (dummy.getTitle().equals(Tittle))
                return true;
        }
        return true;
    }

    //add a book to the library
    private void addBook(Book book){
        books.add(book);
    }

    public void lentBook(Book book , Borrower person){
        if(isAvailable(book)){
            books.remove(book);
            borrowers.put(person,book);
        }
        else{
            System.out.println("Sorry book is not available.");
        }
    }
    public void returnBook(Book book, Borrower person){
        addBook(book);
        borrowers.remove(person,book);
    }
    public static void main(String[]args){
        Library library = new Library();
        library.addBook(new Book("Learning Java", "Tim",01,true));
        System.out.println(library.isAvailable("Learning Java"));
    }

}
