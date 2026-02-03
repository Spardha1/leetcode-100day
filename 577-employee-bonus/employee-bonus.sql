/* Write your T-SQL query statement below */

-- Select E.name , B.bonus
-- from Employee E 
-- join
-- --where empid in (
-- (select empId, bonus
-- from Bonus B
-- where B.bonus <1000 or B.bonus is null) B
-- on E.empid = B.empid


select e.name, b.bonus
from employee e
left join bonus b
on e.empid = b.empid
where b.bonus < 1000
or b.empid is null;