package com.example.bookscatalog.service;

import com.example.bookscatalog.entity.AuthorEntity;
import java.util.List;

public interface AuthorService {

  List<AuthorEntity> findAll();

}
