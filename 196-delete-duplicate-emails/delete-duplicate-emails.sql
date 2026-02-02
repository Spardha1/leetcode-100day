/* Write your T-SQL query statement below */

delete p2 from Person p join person p2 on p.email = p2.email  and p.id <p2.id