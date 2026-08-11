-- Last updated: 8/11/2026, 2:19:31 PM
# Write your MySQL query statement below
SELECT
    MAX(num) AS num
FROM MyNumbers
WHERE num IN (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
);