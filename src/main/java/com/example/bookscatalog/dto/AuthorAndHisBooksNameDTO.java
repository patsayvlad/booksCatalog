package com.example.bookscatalog.dto;

import java.util.List;
import lombok.Data;

@Data
public class AuthorAndHisBooksNameDTO {

  private AuthorFullNameDTO fullName;
  private List<String> booksName;

}
