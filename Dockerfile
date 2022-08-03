version: '3.9'

services:
  app:
    image: 'docker-spring-boot-postgres:latest'
    build:
      context: .
    container_name: app
    depends_on:
      - db
    environment:
      - SPRING_DATASOURCE_URL=jdbc:postgresql://books-catalog-db:5432/books-catalog-db
      - SPRING_DATASOURCE_USERNAME=postgres
      - SPRING_DATASOURCE_PASSWORD=3128
      - SPRING_JPA_HIBERNATE_DDL_AUTO=update

  db:
    image: 'postgres:latest'
    restart: always
    container_name: db
    environment:
      - POSTGRES_USER=postgres
      - POSTGRES_PASSWORD=3128
