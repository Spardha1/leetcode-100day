/* Write your T-SQL query statement below */

select top 1 Customer_number
from orders
group by Customer_number
order by Count(customer_number) desc
