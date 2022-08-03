package com.example.bookscatalog.config;

import com.example.bookscatalog.config.security.user.passwordEncoder.MD5PasswordEncoder;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Setter
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


  @Override
  protected void configure(final HttpSecurity http) throws Exception {
    http
        .cors(httpSecurityCorsConfigurer -> corsConfigurer())
        .httpBasic()
        .and()
        .authorizeRequests()
        .antMatchers("/api/authors/**").authenticated()
        .antMatchers("/api/books/**").authenticated()
        .antMatchers("/api/review/**").authenticated()
        .mvcMatchers(HttpMethod.POST, "/api/authors/**", "/api/books/**").hasAuthority("ADMIN")
        .mvcMatchers(HttpMethod.PUT, "/api/authors/**", "/api/books/**").hasAuthority("ADMIN")
        .and()
        .csrf().disable()
        .formLogin().disable()
    ;
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {

      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/books/**")
            .allowedOrigins("**")
            .allowCredentials(true);
        registry.addMapping("/api/authors/**")
            .allowedOrigins("**")
            .allowCredentials(true);
      }
    };
  }

  @Bean
  public PasswordEncoder encoder() {
    return new MD5PasswordEncoder();
  }

}