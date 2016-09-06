drop database if exists banco;
create database banco;

use banco;

create table cliente(
    idcliente       integer         auto_increment      primary key,
    nome            varchar(35)     not null,
    email           varchar(35)     not null            unique

);

desc cliente;