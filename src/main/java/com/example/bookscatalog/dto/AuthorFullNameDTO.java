package com.example.bookscatalog.dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class AuthorFullNameDTO extends RepresentationModel<AuthorFullNameDTO> {

  private String firstName;
  private String secondName;

}
