/* Write your T-SQL query statement below */
SELECT 
    usr.user_id, 
    usr.email
FROM Users usr
WHERE 
    -- Must contain @ and end with .com
    usr.email LIKE '%@%[a-z].com'
    
    -- Must not contain more than one @
    AND usr.email NOT LIKE '%@%@%'
    
    -- Validate local part (before @): only [a-z0-9_]
    AND LEFT(
            usr.email, 
            CHARINDEX('@', usr.email) - 1
        ) NOT LIKE '%[^a-z0-9_]%'
    
    -- Validate domain part (between @ and .com): only [a-z]
    AND SUBSTRING(
            usr.email,
            CHARINDEX('@', usr.email) + 1,
            LEN(usr.email) - CHARINDEX('@', usr.email) - 4
        ) NOT LIKE '%[^a-z]%'
    
    -- Domain must not be empty
    AND LEN(
        SUBSTRING(
            usr.email,
            CHARINDEX('@', usr.email) + 1,
            LEN(usr.email) - CHARINDEX('@', usr.email) - 4
        )
    ) > 0
ORDER BY 
    usr.user_id;