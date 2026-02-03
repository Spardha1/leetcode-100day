/* Write your T-SQL query statement below */
-- select *,
--     case
--         when x + y > z
--          and x + z > y
--          and y + z > x
--         then 'Yes'
--         else 'No'
--     end as triangle
-- from Triangle;

select t.x, t.y, t.z,
Case
    When t.x+t.y>t.z and t.y+t.z>t.x and t.z+t.x > t.y
    then 'Yes'
    Else 
    'No'
End as triangle    
from Triangle t;