package com.example.bookscatalog.config.security.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "user", catalog = "booksCatalog", schema = "public")
public class AppUser {

  @Id
  @Column(name = "usename")
  private String usename;
  @Column(name = "pasword")
  private String pasword;
  @Column(name = "role")
  private Boolean role;

  public AppUser(String usename, String pasword, Boolean role) {
    this.usename = usename;
    this.pasword = pasword;
    this.role = role;
  }
}