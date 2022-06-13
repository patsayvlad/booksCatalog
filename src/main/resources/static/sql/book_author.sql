-- DROP TABLE IF EXISTS book_author;
--
-- auto-generated definition
create table book_author
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

alter table book_author
    owner to postgres;



INSERT INTO book_author (isbn, id)
VALUES ('7470796828881', 4),
       ('7706739298226', 5),
       ('5694661715008', 9),
       ('7687473831585', 4),
       ('3028521441213', 3),
       ('6959222780486', 10),
       ('6768432967211', 6),
       ('3574654072194', 3),
       ('1431201157266', 1),
       ('3185821766836', 5),
       ('716716714777', 10),
       ('6719252817785', 3),
       ('2308728677087', 1),
       ('485630207215', 5),
       ('8651674103276', 2),
       ('5744804013304', 15),
       ('935288230242', 12),
       ('6744511554249', 4),
       ('5855048772044', 12),
       ('333076584469', 7),
       ('8278720001229', 2),
       ('7463866420228', 7),
       ('818527674082', 6),
       ('2215667653152', 8),
       ('4765276804218', 11);
