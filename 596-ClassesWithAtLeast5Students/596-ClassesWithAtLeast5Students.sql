-- Last updated: 8/11/2026, 2:19:51 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;