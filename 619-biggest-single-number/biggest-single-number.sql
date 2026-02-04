/* Write your T-SQL query statement below */


-- select top 1 num
-- --Max(num) as num
-- from MyNumbers
-- group by num
-- having count(num) = 1 or count(num) = Null
-- order by num desc




SELECT MAX(num) AS num FROM 
(SELECT num FROM MyNumbers GROUP BY num HAVING COUNT(num) = 1 ) NEW;