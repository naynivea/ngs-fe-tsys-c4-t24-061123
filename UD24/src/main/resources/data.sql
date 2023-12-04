drop table if exists empleado;
create table empleado (
    id long auto_increment,
    nombre varchar(250),
    apellido varchar(250),
    direccion varchar(250),
    trabajo varchar(250),
    salario double
);

insert into empleado (nombre, apellido, direccion, trabajo, salario)values('Antonio','Gomez','calle del sueño 1','Analista', null);
insert into empleado (nombre, apellido, direccion, trabajo, salario)values('Maria','Lopez','calle del sueño  2','Gerente', null);
insert into empleado (nombre, apellido, direccion, trabajo, salario)values('Carla','Suarez','calle del sueño 3','Desarrollador', null);
insert into empleado (nombre, apellido, direccion, trabajo, salario)values('Jordi','Martin','calle del sueño 4','Gerente', null);
insert into empleado (nombre, apellido, direccion, trabajo, salario)values('Jonatan','Vicente','calle del sueño 5','Desarrollador', null);

