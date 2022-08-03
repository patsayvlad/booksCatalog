package com.example.bookscatalog.config.security.user;

import com.example.bookscatalog.config.security.user.entity.AppUser;
import com.example.bookscatalog.config.security.user.enums.Role;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AppUserPrincipal implements UserDetails {

  private final AppUser user;

  public AppUserPrincipal(AppUser user) {
    this.user = user;
  }

  @Override
  public String getUsername() {
    return user.getUsename();
  }

  @Override
  public String getPassword() {
    return user.getPasword();
  }

  public String getRole() {
    return Role.getEnumByBoolean(user.getRole());
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    List<SimpleGrantedAuthority> authorities = new ArrayList<>(List.of(new SimpleGrantedAuthority(getRole())));
    return authorities;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  public AppUser getAppUser() {
    return user;
  }

}