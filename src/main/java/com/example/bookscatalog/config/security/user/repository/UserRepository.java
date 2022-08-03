package com.example.bookscatalog.config.security.user.repository;

import com.example.bookscatalog.config.security.user.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<AppUser, String> {

  AppUser findByUsename(String usename);

  @Query(value = "select role\n" +
      "            from \"user\"\n" +
      "            where usename = :usename", nativeQuery = true)
  Boolean findUserRoleByUsename(String usename);

}