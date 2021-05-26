DROP TABLE IF EXISTS CONTACT;

CREATE TABLE CONTACT(
    id varchar(100) PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    mobile_phone VARCHAR(10),
    work_phone VARCHAR(10),
    email VARCHAR(250),
    address VARCHAR(1000)

);