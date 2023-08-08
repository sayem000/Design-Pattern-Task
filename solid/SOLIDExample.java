/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid;

import java.util.List;
import java.util.ArrayList;

// Single Responsibility Principle (SRP)
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Open-Closed Principle (OCP)
interface Discount {
    double applyDiscount(double price);
}

class NoDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}

class TenPercentDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}

// Liskov Substitution Principle (LSP)
class EBook extends Book {
    private String format;

    public EBook(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}

// Interface Segregation Principle (ISP)
interface Readable {
    String getContent();
}

interface Downloadable {
    void download();
}

class EBookReader implements Readable, Downloadable {
    private String content;

    public EBookReader(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void download() {
        System.out.println("Downloading eBook...");
    }
}

// Dependency Inversion Principle (DIP)
class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class SOLIDExample {
    public static void main(String[] args) {
        Book book1 = new Book("Sample Book 1", "Author 1");
        Book book2 = new Book("Sample Book 2", "Author 2");
        EBook eBook = new EBook("Sample eBook", "EAuthor", "PDF");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(eBook);

        Library library = new Library(books);
        library.displayBooks();
    }
}

