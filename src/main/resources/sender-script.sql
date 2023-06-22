use kanwiz;

create table Sender (
    Id int NOT NULL AUTO_INCREMENT,
    Name varchar(255),
    Email varchar(255),
     PRIMARY KEY (Id)
); 

insert into Sender values (1, 'akshaj', 'abc@kanwiz.com');
insert into Sender values (2, 'kuks', 'kuks@kanwiz.com');
insert into Sender values (3, 'gari', 'gari@kanwiz.com');
insert into Sender values (4, 'shiv', 'shiv@kanwiz.com');

select * from Sender