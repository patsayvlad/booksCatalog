package com.example.bookscatalog.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "review")
public class ReviewEntity {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "commenter_name")
  private String commenterName;

  @Column(name = "comment")
  private String comment;

  @Column(name = "rating")
  private Short rating;

  @Column(name = "create_date")
  private String createDate;

  @Column(name = "book_isbn")
  private Long bookIsbn;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "book_isbn", referencedColumnName = "isbn", insertable = false, updatable = false)
  private BookEntity bookByBookIsbn;

}
