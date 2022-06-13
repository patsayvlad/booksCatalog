package com.example.bookscatalog.service.impl;

import com.example.bookscatalog.entity.BookEntity;
import com.example.bookscatalog.repository.BookRepository;
import com.example.bookscatalog.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  @Override
  public List<BookEntity> findAll() {
    return bookRepository.findAll();
  }

  @Override
  public void addBook(BookEntity bookEntity) {
    bookRepository.save(bookEntity);
  }

  @Override
  public void updateBook(BookEntity bookEntity) {
    bookRepository.updateBook(bookEntity.getIsbn(), bookEntity.getName(),
        bookEntity.getPublishedYear(), bookEntity.getPublisher(), bookEntity.getCreateDate());
  }
}
