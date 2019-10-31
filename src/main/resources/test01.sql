
CREATE TABLE Department(
dp_id INT PRIMARY KEY,
dp_name CHAR(20),
dp_numbers INT,
dp_head CHAR(20),
CONSTRAINT ck_01 CHECK(dp_numbers>0 AND dp_numbers<1000)
);
CREATE TABLE Project(
pj_id INT PRIMARY KEY,
pj_name CHAR(20),
dp_id INT,
CONSTRAINT fk_01 FOREIGN KEY(dp_id) REFERENCES Department(dp_id)
);
