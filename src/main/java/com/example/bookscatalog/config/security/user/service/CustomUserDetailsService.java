package com.example.bookscatalog.config.security.user.service;

import com.example.bookscatalog.config.security.user.AppUserPrincipal;
import com.example.bookscatalog.config.security.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public AppUserPrincipal loadUserByUsername(final String usename) {
    return new AppUserPrincipal(userRepository.findByUsename(usename));
  }


}