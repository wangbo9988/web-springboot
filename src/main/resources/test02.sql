CREATE TABLE Employees(
id INT PRIMARY KEY,
name CHAR(20),
sex CHAR(5),
age SMALLINT,
dp_id INT,
annual_salary DOUBLE,
CONSTRAINT ck_02 CHECK(annual_salary>0 AND age>18),
CONSTRAINT fk_02 FOREIGN KEY(dp_id) REFERENCES Department(dp_id)
);