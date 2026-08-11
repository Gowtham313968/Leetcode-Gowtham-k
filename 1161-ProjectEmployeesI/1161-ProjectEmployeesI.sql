-- Last updated: 8/11/2026, 2:17:05 PM
# Write your MySQL query statement below
SELECT
    project_id,
    ROUND(AVG(experience_years), 2) AS average_years
FROM Project p
JOIN Employee e
ON p.employee_id = e.employee_id
GROUP BY project_id;