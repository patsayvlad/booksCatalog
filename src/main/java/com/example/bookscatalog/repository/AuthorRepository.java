package com.example.bookscatalog.repository;

import com.example.bookscatalog.entity.AuthorEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

  List<AuthorEntity> findAll();

}
