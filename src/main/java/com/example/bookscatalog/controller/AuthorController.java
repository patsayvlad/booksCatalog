package com.example.bookscatalog.controller;

import com.example.bookscatalog.entity.AuthorEntity;
import com.example.bookscatalog.service.AuthorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/authors")
public class AuthorController {

  private final AuthorService authorService;

  @GetMapping
  public List<AuthorEntity> getBooks() {
    return authorService.findAll();
  }

}
