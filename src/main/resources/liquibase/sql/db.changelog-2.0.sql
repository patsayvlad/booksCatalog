create table if not exists author
(
    id          bigserial
        constraint author_pk
            primary key,
    first_name  varchar(255),
    second_name varchar(255)
);



create table if not exists book
(
    isbn           bigint       not null
        constraint book_pk
            primary key,
    name           varchar(255) not null,
    published_year smallint     not null,
    publisher      varchar(255) not null,
    create_date    varchar(8)   not null
);


create table if not exists review
(
    id             bigserial
        constraint review_pk
            primary key,
    commenter_name varchar(255) not null,
    comment        varchar(10000),
    rating         smallserial,
    create_date    varchar(8)   not null,
    book_isbn      bigint
        constraint review_book_isbn_fk
            references book
            on update cascade
);


create unique index if not exists review_id_uindex
    on review (id);

create unique index if not exists book_isbn_uindex
    on book (isbn);


create table if not exists book_author
(
    isbn bigint not null
        constraint book_author_book_isbn_fk
            references book
            on update cascade on delete cascade,
    id   bigint not null
        constraint book_author_author_id_fk
            references author
            on update cascade on delete cascade,
    constraint book_author_pk
        primary key (isbn, id)
);

create table if not exists "user"
(
    usename varchar(25)        not null,
    pasword varchar(33),
    role     bool default false not null
);

create unique index if not exists user_username_uindex
    on "user" (usename);

