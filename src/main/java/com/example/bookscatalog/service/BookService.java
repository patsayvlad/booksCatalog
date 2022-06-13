package com.example.bookscatalog.service;

import com.example.bookscatalog.entity.BookEntity;
import java.util.List;

public interface BookService {

  List<BookEntity> findAll();

  void addBook(BookEntity bookEntity);

  void updateBook(BookEntity bookEntity);
}
