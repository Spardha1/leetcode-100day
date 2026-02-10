/* Write your T-SQL query statement below */


-- select 
-- b.name ad department,
-- a.name as Employee,

--  dense_rank() over (partition by b.name order by Max(salary) desc) as rank

-- from employee a
-- left join department b on departmentid = id 

-- select 
-- e.name as Employee,
-- e.salary as Salary,
-- d.name as Department
-- from 
-- employee e
-- left join 
-- department d
-- on e.departmentid = d.id
-- where e.departmentid in 
-- (
-- select a.name, a.id,MAX(b.salary) from department a inner join employee b on a.id = b.departmentid
-- group by b.departmentId)


SELECT
    t.name AS Department,
    e.name AS Employee,
    e.salary
FROM Employee e
JOIN (
    SELECT
        d.id,
        d.name,
        MAX(e.salary) AS max_salary
    FROM Department d
    JOIN Employee e ON d.id = e.departmentId
    GROUP BY d.id, d.name
) t
ON e.departmentId = t.id
WHERE e.salary = t.max_salary;