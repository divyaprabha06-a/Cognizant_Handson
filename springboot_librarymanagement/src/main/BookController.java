package librarymanagementboot.controller;

import librarymanagementboot.entity.Book;
import librarymanagementboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping
    public String home() {
        return "Spring Boot Exercise 9 is running successfully!";
    }
}
