/* Write your T-SQL query statement below */

SELECT p1.firstName, p1.LastName, a.city, a.state
FROM Person p1
left join 
Address a
on p1.personid = a.personid


