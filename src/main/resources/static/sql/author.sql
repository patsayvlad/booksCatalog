-- DROP TABLE IF EXISTS "author";
--
create table author
(
    id          bigserial
        constraint author_pk
            primary key,
    first_name  varchar(255),
    second_name varchar(255)
);


INSERT INTO author (id, first_name, second_name)
VALUES (1, 'Gretchen', 'Waller'),
       (2, 'Kaitlin', 'Barlow'),
       (3, 'Brenda', 'Espinoza'),
       (4, 'Cooper', 'Hodge'),
       (5, 'Alika', 'Carlson'),
       (6, 'Miriam', 'Carlson'),
       (7, 'Daryl', 'Cantu'),
       (8, 'Cairo', 'Cash'),
       (9, 'May', 'Christian'),
       (10, 'Darrel', 'Livingston'),
       (11, 'Davis', 'Marks'),
       (12, 'Anne', 'Guerra'),
       (13, 'Sydnee', 'Bass'),
       (14, 'Jared', 'Brennan'),
       (15, 'Hall', 'Espinoza');
