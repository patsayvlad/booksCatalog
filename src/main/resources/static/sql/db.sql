create table if not exists books_catalog.author
(
    id          bigserial
        constraint author_pk
            primary key,
    first_name  varchar(255),
    second_name varchar(255)
);

alter table books_catalog.author
    owner to postgres;

create table if not exists books_catalog.book
(
    isbn           bigint       not null
        constraint book_pk
            primary key,
    name           varchar(255) not null,
    published_year smallint     not null,
    publisher      varchar(255) not null,
    create_date    varchar(8)   not null
);

alter table books_catalog.book
    owner to postgres;

create table if not exists books_catalog.review
(
    id             bigserial
        constraint review_pk
            primary key,
    commenter_name varchar(255) not null,
    comment        varchar(10000),
    rating         smallserial,
    create_date    varchar(8)   not null,
    book_isbn      integer
        constraint review_book_isbn_fk
            references books_catalog.book
            on update cascade
);

alter table books_catalog.review
    owner to postgres;

create unique index if not exists review_id_uindex
    on books_catalog.review (id);

create unique index if not exists book_isbn_uindex
    on books_catalog.book (isbn);

create table if not exists books_catalog.book_author
(
    isbn bigint not null
        constraint book_author_book_isbn_fk
            references books_catalog.book
            on update cascade on delete cascade,
    id   bigint not null
        constraint book_author_author_id_fk
            references books_catalog.author
            on update cascade on delete cascade,
    constraint book_author_pk
        primary key (isbn, id)
);

alter table books_catalog.book_author
    owner to postgres;

