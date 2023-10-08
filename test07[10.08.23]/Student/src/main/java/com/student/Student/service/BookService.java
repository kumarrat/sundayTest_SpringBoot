package com.student.Student.service;

import com.student.Student.model.Book;
import com.student.Student.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    static IBookRepo bookRepo;

    public static String saveBook(Book newBook) {
        bookRepo.save(newBook);
        return "Book Added";
    }

    public List<Book> getBook() {
        return bookRepo.findAll();
    }

    public String removeBook(Long id) {
        bookRepo.deleteById(id);
        return "Book removed";
    }

    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElseThrow();
    }
}
