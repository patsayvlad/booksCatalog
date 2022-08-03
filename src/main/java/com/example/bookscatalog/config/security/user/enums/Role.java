package com.example.bookscatalog.config.security.user.enums;

import java.util.Arrays;

public enum Role {

  ADMIN(true), USER(false);

  Boolean isAdmin;

  Role(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public static String getEnumByBoolean(Boolean isAdmin) {
    return Arrays.stream(Role.values())
        .filter(role -> role.isAdmin.equals(isAdmin))
        .findFirst()
        .map(Enum::name).orElse(null);
  }
}
