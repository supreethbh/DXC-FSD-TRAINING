##Please run the below DDL query before you execute this application.  

CREATE TABLE BOOKS (Book_ID  INT(6)  PRIMARY KEY,
		    Book_Title  VARCHAR(100),
		    Author VARCHAR(50),
		    Book_Price  DOUBLE(6,2));


INSERT INTO BOOKS (Book_ID, Book_Title, Author, Book_Price)  
VALUES (101,'Java Closures and Lambda','Robert Fischer',460);


INSERT INTO BOOKS (Book_ID, Book_Title, Author, Book_Price)
VALUES (102,'Pro Java 8 Programming','Brett Spell',600);


INSERT INTO BOOKS (Book_ID, Book_Title, Author, Book_Price)
VALUES (103,'Java for Android, Second Edition','Budi Kurniawan',680);


INSERT INTO BOOKS (Book_ID, Book_Title, Author, Book_Price)
VALUES (105,'Java EE 7: The Big Picture','Danny Coward',340);


INSERT INTO BOOKS (Book_ID, Book_Title, Author, Book_Price)
VALUES (104,'Java: The Complete Reference, Ninth Edition','Herbert Schildt',700);

INSERT INTO BOOKS (Book_ID, Book_Title, Author, Book_Price)
VALUES (106,'Beginning Java with WebSphere','Robert W. Janson',550);

commit;