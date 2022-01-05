--liquibase formatted sql

--changeset pav:1
create table users (
   id bigserial primary key,
   name varchar(255)
);

--rollback drop table users;
