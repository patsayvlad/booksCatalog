package com.example.bookscatalog.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book", schema = "books_catalog", catalog = "booksCatalog")
public class BookEntity {

  @Id
  @Column(name = "isbn")
  private Long isbn;

  @Column(name = "name")
  private String name;

  @Column(name = "published_year")
  private Short publishedYear;

  @Column(name = "publisher")
  private String publisher;

  @Column(name = "create_date")
  private String createDate;

  @OneToMany(mappedBy = "bookByIsbn")
  private List<BookAuthorEntity> bookAuthorsByIsbn;

  @OneToMany(mappedBy = "bookByBookIsbn")
  private List<ReviewEntity> reviewsByIsbn;

}
