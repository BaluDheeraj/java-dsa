--using the basic method
select Max(salary) AS SecondHighestSalary from employee where salary<(select max(salary) from employee);
--using offset and limit
SELECT (
  SELECT DISTINCT salary
  FROM Employee
  ORDER BY salary DESC
  LIMIT 1 OFFSET 1
) AS SecondHighestSalary;
