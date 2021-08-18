DROP TABLE if exists user ;
CREATE TABLE User(
	Phone_Number BIGINT,
	User_Name varchar(50) Not null,
    Email_id varchar(50) NOT NULL,
    Gender varchar(10),
    DateOfBirth DATE NOT NULL,
    Address VARCHAR(255) NOT NULL,
    PRIMARY KEY (Phone_Number)
    );
    
CREATE TABLE TRAINERS(
	Trainer_ID INT PRIMARY KEY,
    Trainer_Gender varchar(6) NOT NULL,
    Trainer_Name varchar(50) NOT NULL,
    Trainer_ContactNo BIGINT NOT NULL,
    Trainer_fees int NOT NULL   
    );
    
    
CREATE TABLE Appointments(
	Appointment_DateAndTime DATETIME NOT NULL,
    User_id bigint Not null,
    Trainer_id int not null,
    package int not null,
    foreign key (User_id) REFERENCES User (Phone_Number),
    foreign key (Trainer_id) REFERENCES TRAINERS (Trainer_ID),
    Primary key (User_id,Trainer_id)    
    );


INSERT INTO User VALUES 
(9988557733, 'ISHIKA MISHRA', 'ishika@yahoo.in', 'F', 0000-00-00, '06, shivaji nagar,nasik'),
(8855224433, 'Rohan kumar', 'rohan@gmail.com', 'M', 0000-00-00, 'B32, VASHI,MUMBAI');

SELECT * FROM User;


    