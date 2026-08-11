-- Last updated: 8/11/2026, 2:16:31 PM
SELECT
    query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(
        100 * AVG(rating < 3),
        2
    ) AS poor_query_percentage
FROM Queries
GROUP BY query_name;