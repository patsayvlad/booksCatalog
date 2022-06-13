package com.example.bookscatalog.repository;

import com.example.bookscatalog.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

  @Transactional
  @Modifying
  @Query(value = "UPDATE books_catalog.book "
      + "SET isbn = :isbn, "
      + "name = :name, "
      + "published_year = :publishedYear, "
      + "publisher = :publisher, "
      + "create_date = :createDate "
      + "WHERE isbn = :isbn",
      nativeQuery = true)
  void updateBook(Long isbn, String name, Short publishedYear, String publisher, String createDate);

}
