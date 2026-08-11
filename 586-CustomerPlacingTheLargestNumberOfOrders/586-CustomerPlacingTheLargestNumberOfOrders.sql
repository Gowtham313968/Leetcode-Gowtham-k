-- Last updated: 8/11/2026, 2:19:56 PM
SELECT customer_number
FROM Orders 
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;