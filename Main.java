//FAKHRI NAUFALDI RAMADHAN
//227064516035
package uas_paldi;
class Book {
    private String title;
    private String author;
    private String price;
    private String isbn;
    private String year;

    // Getter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPrice() {
        return price;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getYear() {
        return year;
    }
    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setYear(String year) {
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Belajar ngoding");
        book1.setAuthor("Paldie");
        book1.setPrice("Rp.150.000");
        book1.setIsbn("978-1234567890");
        book1.setYear("2024");

        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("ISBN: " + book1.getIsbn());
        System.out.println("Year: " + book1.getYear());

        book1.setPrice("Rp.300.000");
        System.out.println("Updated Price: " + book1.getPrice());
}
}
