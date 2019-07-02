CREATE TABLE coletas(
 id serial PRIMARY KEY,	
 mac_address varchar(50) NOT NULL,
 volume DECIMAL NOT NULL,
 temperatura DECIMAL NOT NULL,
 data_coleta TIMESTAMP NOT NULL,
 vibracao_detectada BOOLEAN NOT NULL
);