/* Write your T-SQL query statement below */


select class
from Courses C
group by class
-- order by Count()
Having Count(student) >= 5