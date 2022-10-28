create database imperioHotel
	default character set utf8mb3
		default collate utf8mb3_general_ci;
use imperiohotel;

CREATE TABLE Cliente (
	idCliente int unique auto_increment,
    nome VARCHAR(30) not null,
    cpf VARCHAR(11),
    /*e_mail VARCHAR(30) not null,
    rg VARCHAR(20) not null,
    idade DATE not null,*/
    primary key(cpf)
);

/*
alter table Cliente 
	drop idade;
    
alter table Cliente
	drop rg;
*/

CREATE TABLE passagem (
    idDestino int auto_increment,
    data_Viagem date not null,
    data_Retorno date not null,
    LocalOrigem VARCHAR(40) not null,
    LocalDestino VARCHAR(40) not null,
    valor decimal(8, 2) not null,
    numerosPassageiros int(2) not null,
    tipoPassagem enum('I', 'V') not null,
    clienteCpf VARCHAR(11) UNIQUE,
    idSolicitacao int unique,
	foreign key(clienteCpf) references Cliente (cpf),
    foreign key(idSolicitacao) references promocoes (idSolicitacao),
    primary key(idDestino)
);


CREATE TABLE contato_reclamacao (
    e_mail varchar(30) PRIMARY KEY UNIQUE,
    Assunto text,
    clienteCpf VARCHAR(11),
    foreign key(clienteCpf) references Cliente (cpf)
);
/*
alter table contato_reclamacao add column nome varchar(40);
*/
CREATE TABLE promocoes (
    idSolicitacao INTEGER auto_increment,
    e_mail VARCHAR(30) not null,
    nome VARCHAR(40) not null,
    destinoDesejado VARCHAR(40) not null,
    qtdDias INTEGER(2),
    valor decimal(8, 2),
    clienteCpf VARCHAR(11),
    foreign key(clienteCpf) references Cliente(cpf),
    primary key(idSolicitacao)
);

/*
CREATE TABLE converte (
    passagem_idDestino INTEGER,
    promocoes_idSolicitacao INTEGER,
    foreign key(passagem_idDestino) references passagem(idDestino),
    foreign key(promocoes_idSolicitacao) references promocoes(idSolicitacao)
);
*/