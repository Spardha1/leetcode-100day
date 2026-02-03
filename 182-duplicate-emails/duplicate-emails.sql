/* Write your T-SQL query statement below */
-- SELECT today.id
-- FROM Weather yesterday 
-- CROSS JOIN Weather today
-- WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
--     AND today.temperature > yesterday.temperature
-- ;

select email as Email from person 
group by email 
having Count(*)>1