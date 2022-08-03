package com.example.bookscatalog.dto;

import java.util.List;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class AuthorAndHisBooksNameDTO extends RepresentationModel<AuthorAndHisBooksNameDTO> {

  private AuthorFullNameDTO fullName;
  private List<String> booksName;

}
