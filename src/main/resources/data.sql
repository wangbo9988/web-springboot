INSERT INTO Department(dp_id,dp_name,dp_numbers,dp_head) VALUES
(1,'部门一',3,'李四'),
(2,'部门二',2,'张三'),
(3,'部门三',3,'王五'),
(4,'部门思',2,'一号'),
(5,'部门吴',5,'二号');

INSERT INTO Project(pj_id,pj_name,dp_id) VALUES
(1,'项目一',1),
(2,'项目二',2),
(3,'项目三',3),
(4,'项目四',4),
(5,'项目五',5);

INSERT INTO Employees(id,name,sex,age,dp_id,annual_salary) VALUES
(1,'员工一','男',21,1,2000.00),
(2,'员工二','男',23,2,3000.00),
(3,'员工三','男',21,3,2500.00),
(4,'员工四','男',21,4,2000.00),
(5,'员工五','男',21,5,5000.00)