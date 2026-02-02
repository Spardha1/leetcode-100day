/* Write your T-SQL query statement below */
-- select 
-- from Customers c
-- left join Orders o
-- on c.id = o.customerId
-- where o.id 

select name as Customers from Customers 
Where Customers.id not in (select customerid from Orders)