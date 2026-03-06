package com.fsad.library;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LibraryController {

    List<Book> books = new ArrayList<>();

    // 1 Welcome message
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Online Library System!";
    }

    // 2 Total books count
    @GetMapping("/count")
    public int getBookCount() {
        return 100;
    }

    // 3 Sample price
    @GetMapping("/price")
    public double getPrice() {
        return 499.99;
    }

    // 4 List of book titles
    @GetMapping("/books")
    public List<String> getBooks() {

        List<String> titles = new ArrayList<>();

        titles.add("Java Programming");
        titles.add("Spring Boot Guide");
        titles.add("Data Structures");

        return titles;
    }

    // 5 Book by ID
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book ID: " + id;
    }

    // 6 Search book
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book: " + title;
    }

    // 7 Author
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by author: " + name;
    }

    // 8 Add Book
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {

        books.add(book);

        return "Book added successfully!";
    }

    // 9 View all books
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return books;
    }

}