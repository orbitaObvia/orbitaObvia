create table usuario(

idusuario int primary key not null ,
datanascimento date,
cep int,
cpf int,
email varchar(255),
administrador varchar(255),
senha varchar(255),
ativo char

);

create table catalogo(

iditem int primary key not null,
nomeitem varchar (255) not null,
valorinicial int,
ativo char(3),
idusuario int,
valorcompra int,
descricao varchar(255),
foreign key (idusuario) references usuario(idusuario) );

create table lances(

idlance int primary key not null,
iditem int not null, 
maiorvalor int, 
vendido char(3),
idusuario int,
ddata date,
precolance int,

foreign key (iditem) references catalogo(iditem),
foreign key (idusuario) references usuario(idusuario) );


create table leilao(

idleilao int primary key not null,
idusuario int not null,
idlance int,
iditem int,
lancevencedor int ,
ddata date,
foreign key (idusuario) references usuario(idusuario),
foreign key (idlance) references lances(idlance),
foreign key (iditem) references catalogo(iditem));


select * from usuario;
select * from catalogo;
select * from lances;
select * from leilao;
