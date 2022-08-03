package com.example.bookscatalog.controller;

import com.example.bookscatalog.entity.BookEntity;
import com.example.bookscatalog.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/books") //todo
public class BookController {

  private final BookService bookService;

  @GetMapping
  public List<BookEntity> getBooks() {
    List<BookEntity> all = bookService.findAll();
    return all;
  }

  @PostMapping("/add-book")
  public void addBook(@RequestBody BookEntity bookEntity){
    bookService.addBook(bookEntity);
  }

  @PutMapping("/update-book")
  public void updateBook(@RequestBody BookEntity bookEntity){
    bookService.updateBook(bookEntity);
  }
}
