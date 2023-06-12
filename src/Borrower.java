import java.util.LinkedList;

public class Borrower {
    /* class called "Borrower" with attributes such as name, ID, and a list of borrowed books. */

    public String name;
    private int ID;
    LinkedList<Book> borrowedBooks = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LinkedList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void returnedBook(Book book){
        borrowedBooks.remove(book);
    }
}
