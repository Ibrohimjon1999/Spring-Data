drop table if exists book;
drop table if exists hibernate_sequence;

create table book (
    id bigint not null,
    isbn varchar(255),
    publisher varchar(255),
    title varchar(255),
    primary key (id)
) engine=InnoDb;

create table hibernate_sequence (
    next_val bigint
) engine=InnoDb;

insert into hibernate_sequence values (1);