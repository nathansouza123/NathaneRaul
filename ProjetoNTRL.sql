go
create database raulnathan
go
go
use raulnathan
go

create table cadastro
(nome varchar(50) 	   	 not null,
 codigo int         	 not null,
 cep    int				 not null,
 endereco varchar(70)	 not null,
 bairro varchar(70) 	 not null,
 cidade varchar(20) 	 not null); 