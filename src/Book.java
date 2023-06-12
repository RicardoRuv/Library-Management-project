public class Book {

    private String title;
    private String author;
    private int ISBN;
    private boolean availability= true;

    public Book() {
    }

    public Book(String title, String author, int ISBN, boolean availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getISBN(){
        return this.ISBN;
    }

    public boolean getAvailability() {
        return this.availability;
    }
}
