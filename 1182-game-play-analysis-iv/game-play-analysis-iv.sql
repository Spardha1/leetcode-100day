/* Write your T-SQL query statement below */


SELECT
    CAST(
        ROUND(
            1.0 * COUNT(DISTINCT a1.player_id) /
            (SELECT COUNT(DISTINCT player_id) FROM Activity),
        2) 
    AS DECIMAL(10,2)) AS fraction
FROM (
    SELECT player_id, MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
) AS a1
JOIN Activity AS a2
    ON a1.player_id = a2.player_id
   AND a2.event_date = DATEADD(day, 1, a1.first_login);
