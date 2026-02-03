/* Write your T-SQL query statement below */

-- Select SP.name
-- -- sales_id , 
-- from SalesPerson SP
-- left join Company C ON SP.sales_id = C.com_id
-- left join Orders O ON O.com_id = C.com_id and O.sales_id = SP.sales_id
-- --select C.name from Company C 
-- where C.name <> 'RED'


-- select name 
-- from SalesPerson S
-- where not exists(
--     Select 1 
--     from Orders O
--     left join Company C ON O.com_id = O.order_id
--     where c.name = 'RED'
--     and O.sales_id = S.sales_id
-- )

select name
from SalesPerson s
where not exists (
    select 1
    from orders o
    inner join company c
    on o.com_id = c.com_id
    where c.name = 'RED'
    and o.sales_id = s.sales_id
);