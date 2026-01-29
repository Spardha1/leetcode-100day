WITH friendships AS (
    SELECT requester_id AS user_id, accepter_id AS friend_id
    FROM requestaccepted
    UNION ALL
    SELECT accepter_id AS user_id, requester_id AS friend_id
    FROM requestaccepted
)
SELECT TOP 1
    user_id AS id,
    COUNT(friend_id) AS num
FROM friendships
GROUP BY user_id
ORDER BY COUNT(friend_id) DESC;