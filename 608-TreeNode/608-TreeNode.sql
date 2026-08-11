-- Last updated: 8/11/2026, 2:19:39 PM
SELECT
    id,
    CASE
        WHEN p_id IS NULL THEN 'Root'
        WHEN id IN (SELECT DISTINCT p_id FROM Tree WHERE p_id IS NOT NULL)
            THEN 'Inner'
        ELSE 'Leaf'
    END AS type
FROM Tree;