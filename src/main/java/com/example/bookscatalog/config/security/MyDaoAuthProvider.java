package com.example.bookscatalog.config.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@AllArgsConstructor
public class MyDaoAuthProvider extends DaoAuthenticationProvider {

  private PasswordEncoder passwordEncoder;

  @Override
  protected void additionalAuthenticationChecks(UserDetails userDetails,
      UsernamePasswordAuthenticationToken authentication) {
    if (authentication.getCredentials() == null) {
      logger.debug("Authentication failed: no credentials provided");

      throw new BadCredentialsException(messages.getMessage(
          "AbstractUserDetailsAuthenticationProvider.badCredentials",
          "Bad credentials"));
    }

    String presentedPassword = authentication.getCredentials().toString()
        .concat(userDetails.getUsername());

    if (!passwordEncoder.matches(presentedPassword, userDetails.getPassword())) {
      logger.debug("Authentication failed: password does not match stored value");

      throw new BadCredentialsException(messages.getMessage(
          "AbstractUserDetailsAuthenticationProvider.badCredentials",
          "Bad credentials"));
    }
  }
}
