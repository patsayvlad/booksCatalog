-- DROP TABLE IF EXISTS "author";
--
-- auto-generated definition
create table book
(
    isbn           bigint       not null
        constraint book_pk
            primary key,
    name           varchar(255) not null,
    published_year smallint     not null,
    publisher      varchar(255) not null,
    create_date    varchar(8)   not null
);

alter table book
    owner to postgres;

create unique index book_isbn_uindex
    on book (isbn);



INSERT INTO book (isbn, name, published_year, publisher, create_date)
VALUES ('7470796828881', 'vulputate ullamcorper', 2005, 'et netus', '20230405'),
       ('7706739298226', 'montes, nascetur ridiculus', 2006, 'odio.', '20220201'),
       ('5694661715008', 'aliquet.', 1965, 'non, egestas', '20230329'),
       ('7687473831585', 'vestibulum, neque', 1975, 'nec', '20221125'),
       ('3028521441213', 'Sed', 2002, 'Curae Donec', '20210812'),
       ('6959222780486', 'justo. Praesent', 1983, 'feugiat', '20220720'),
       ('6768432967211', 'per conubia', 1995, 'Cras eget nisi', '20230306'),
       ('3574654072194', 'nisl. Nulla', 1969, 'pellentesque. Sed dictum.', '20220309'),
       ('1431201157266', 'velit.', 1960, 'conubia', '20210720'),
       ('3185821766836', 'ligula', 1956, 'nec, eleifend', '20221110'),
       ('7167167147771', 'facilisi. Sed', 1973, 'a mi', '20220923'),
       ('6719252817785', 'in lobortis', 1995, 'Ut', '20220728'),
       ('2308728677087', 'convallis dolor.', 1982, 'congue a,', '20221101'),
       ('4856302072151', 'dictum augue malesuada', 1986, 'nec urna', '20230326'),
       ('8651674103276', 'Proin mi.', 1962, 'nisi. Mauris nulla.', '20230130'),
       ('5744804013304', 'tristique neque venenatis', 1982, 'purus', '20220901'),
       ('9352882302421', 'rutrum. Fusce', 2006, 'mattis', '20211225'),
       ('6744511554249', 'arcu. Vestibulum ut', 1982, 'quis, pede.', '20230402'),
       ('5855048772044', 'tellus', 1958, 'taciti sociosqu ad', '20220223'),
       ('3330765844691', 'mauris', 1995, 'eu dui. Cum', '20221231'),
       ('8278720001229', 'parturient montes, nascetur', 1977, 'dapibus gravida.', '20220827'),
       ('7463866420228', 'at sem', 1963, 'velit.', '20220225'),
       ('8185276740821', 'nibh. Phasellus nulla.', 1956, 'pharetra, felis eget', '20221112'),
       ('2215667653152', 'lectus sit', 1978, 'sem,', '20221201'),
       ('4765276804218', 'Donec egestas.', 1988, 'lectus pede', '20210827');
