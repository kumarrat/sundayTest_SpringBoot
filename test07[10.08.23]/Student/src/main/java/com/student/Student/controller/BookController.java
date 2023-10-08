package com.student.Student.controller;

import com.student.Student.model.Book;
import com.student.Student.model.Laptop;
import com.student.Student.service.BookService;
import com.student.Student.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book newBook)
    {
        return BookService.saveBook(newBook);
    }

    @GetMapping("books")
    public List<Book> getBook()
    {
        return bookService.getBook();
    }

    @DeleteMapping("book/{id}")
    public String removeBook(@PathVariable Long id)
    {
        return bookService.removeBook(id);
    }

    @GetMapping("book/{id}/id")
    public Book getBookById(@PathVariable Long id)
    {
        return bookService.getBookById(id);
    }


}
