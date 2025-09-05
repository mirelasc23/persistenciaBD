create table aluno(
 id serial,
 nome varchar(100) not null,
 email varchar(100) not null,
 unique(email),
 primary key (id)
);

insert into aluno (nome, email) values ('ana', 'ana@gmail.com');


select * from aluno;