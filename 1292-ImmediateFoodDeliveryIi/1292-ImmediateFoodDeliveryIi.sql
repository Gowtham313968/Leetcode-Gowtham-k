-- Last updated: 8/11/2026, 2:16:39 PM
SELECT
    ROUND(
        AVG(first_order = customer_pref_delivery_date) * 100,
        2
    ) AS immediate_percentage
FROM (
    SELECT
        customer_id,
        MIN(order_date) AS first_order,
        MIN(customer_pref_delivery_date) AS customer_pref_delivery_date
    FROM Delivery
    GROUP BY customer_id
) t;