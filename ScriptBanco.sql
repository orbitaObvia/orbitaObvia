create table usuario(

idusuario serial primary key not null ,
datanascimento date,
cep varchar(9),
nomeusuario varchar(255),
cpf varchar(12),
email varchar(255),
senha varchar(255),
ativo bit(1)
);

create table catalogo(

iditem serial primary key not null,
nomeitem varchar (255) not null,
descricao varchar(255),
valorinicial numeric,
ativo bit(1),
idusuario serial,
valorcompra int,

foreign key (idusuario) references usuario(idusuario) );

create table lances(

idlance serial primary key not null,
iditem serial not null, 
maiorvalor numeric, 
vendido bit(1),
idusuario serial,
ddata timestamp with time zone,
precolance numeric,

foreign key (iditem) references catalogo(iditem),
foreign key (idusuario) references usuario(idusuario) );

select * from usuario;
select * from catalogo;
select * from lances;

