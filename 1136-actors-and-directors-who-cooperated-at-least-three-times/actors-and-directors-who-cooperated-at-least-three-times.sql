/* Write your T-SQL query statement below */

-- select 
-- from actorDirector a
-- join actorDirector d
-- on a.actor_id = d.director_id
-- groupby


select  actor_id, director_id
from ActorDirector
group by actor_id, director_id
having count(*) >= 3