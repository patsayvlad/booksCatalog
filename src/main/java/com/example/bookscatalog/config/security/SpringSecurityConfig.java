//package com.example.bookscatalog.config.security;
//
//import com.example.bookscatalog.config.security.user.passwordEncoder.MD5PasswordEncoder;
//import com.example.bookscatalog.config.security.user.service.CustomUserDetailsService;
//import javax.annotation.PostConstruct;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Setter
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//
//  @Autowired
//  private WebApplicationContext applicationContext;
//  private CustomUserDetailsService userDetailsService;
//
//  @PostConstruct
//  public void completeSetup() {
//    userDetailsService = applicationContext.getBean(CustomUserDetailsService.class);
//  }
//
//  @Override
//  protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userDetailsService)
//        .passwordEncoder(encoder())
//        .and()
//        .authenticationProvider(authenticationProvider())
//        .jdbcAuthentication()
//    ;
//  }
//
//  @Override
//  protected void configure(final HttpSecurity http) throws Exception {
//    http
//        .cors(httpSecurityCorsConfigurer -> corsConfigurer())
//        .httpBasic()
//        .and()
//        .authorizeRequests()
//        .antMatchers("/api/authors/**").authenticated()
//        .antMatchers("/api/books/**").authenticated()
//        .and()
//        .csrf().disable()
//        .formLogin().disable()
//    ;
//  }
//
//  @Bean
//  public WebMvcConfigurer corsConfigurer() {
//    return new WebMvcConfigurer() {
//
//      @Override
//      public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/sessions/**")
//            .allowedOrigins("http://localhost:4200", "http://35.153.159.233")
//            .allowCredentials(true);
//        registry.addMapping("/activities/**")
//            .allowedOrigins("http://localhost:4200", "http://35.153.159.233")
//            .allowCredentials(true);
//      }
//    };
//  }
//
//  @Bean
//  public DaoAuthenticationProvider authenticationProvider() {
//    final DaoAuthenticationProvider authProvider = new MyDaoAuthProvider(encoder());
//    authProvider.setUserDetailsService(userDetailsService);
//    return authProvider;
//  }
//
//  @Bean
//  public PasswordEncoder encoder() {
//    return new MD5PasswordEncoder();
//  }
//
//}
