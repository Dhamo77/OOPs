import java.util.ArrayList;
/**   Write a Java program to create a class called "Book" with attributes for title, author,
    and ISBN, and methods to add and remove books from a collection.*/
public class Book {
    private String titel,author;
    private String ISBN;
    private  ArrayList<Book> bookArrayList=new ArrayList<>();
    public  Book(){

    }

    public Book(String titel, String author, String ISBN) {
        this.titel = titel;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public  void addbook(Book book){
        bookArrayList.add(book);
    }
    public  void removebook(Book book){
        bookArrayList.remove(book);
    }

    public  ArrayList<Book> getBooks(){
        return bookArrayList;
    }

    @Override
    public String toString() {
        return "Book { " + "titel='" + titel + ", author='" + author + ", ISBN=" + ISBN + " }";
    }

    public static void main(String[] args) {
        Book creat =new Book();// object for calling the arraylist functions or to avoid the object creation declair the function in static
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        creat.addbook(book1);
        creat.addbook(book2);
        ArrayList<Book> collection =creat.getBooks();
        for (Book b:collection){
            System.out.println(b.toString());
        }
        creat.removebook(book1);
        for (Book b:collection){
            System.out.println(b.toString());
        }
    }
}
