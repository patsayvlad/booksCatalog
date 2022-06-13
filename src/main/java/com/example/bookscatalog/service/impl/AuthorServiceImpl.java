package com.example.bookscatalog.service.impl;

import com.example.bookscatalog.entity.AuthorEntity;
import com.example.bookscatalog.repository.AuthorRepository;
import com.example.bookscatalog.service.AuthorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

  private final AuthorRepository authorRepository;

  @Override
  public List<AuthorEntity> findAll() {
    return authorRepository.findAll();
  }
}
