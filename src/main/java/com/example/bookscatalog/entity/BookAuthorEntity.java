package com.example.bookscatalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "book_author", schema = "books_catalog", catalog = "booksCatalog")
@IdClass(BookAuthorEntityPK.class)
public class BookAuthorEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "isbn")
  private Long isbn;

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "isbn", referencedColumnName = "isbn", nullable = false, insertable = false, updatable = false)
  private BookEntity bookByIsbn;

  @ManyToOne
  @JoinColumn(name = "id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
  private AuthorEntity authorById;

}
