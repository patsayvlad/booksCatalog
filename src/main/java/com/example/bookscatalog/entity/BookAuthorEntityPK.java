package com.example.bookscatalog.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookAuthorEntityPK implements Serializable {

  @Column(name = "isbn")
  @Id
  private Long isbn;

  @Column(name = "id")
  @Id
  private Long id;

}
