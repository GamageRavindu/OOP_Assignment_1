public class Book extends BorrrowableItems {
    private String title;
    private String Author;
    private String ISBN;
    private Boolean available;

    public Book(String title, String Author, String ISBN, Boolean available) {
        this.title = title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getISBN() {
        return ISBN;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public void displayInfo() {
        System.out.println("title: " + title);
        System.out.println("Author: " + Author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("available: " + available);
    }

}
