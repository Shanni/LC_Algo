# Write your MySQL query statement below
select e.Name as Employee from Employee as e join Employee as b on e.ManagerId=b.Id and e.Salary > b.Salary;