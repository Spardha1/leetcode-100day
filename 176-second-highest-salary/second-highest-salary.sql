/* Write your T-SQL query statement below */

select MAX(salary) as SecondHighestSalary 
from 
(Select
Salary,
DENSE_RANK() OVER (order by  salary desc) as rnk
from employee) 
as allRankedSalary
where rnk = 2
