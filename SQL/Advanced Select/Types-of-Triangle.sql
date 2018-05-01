Write a query identifying the type of each record in the TRIANGLES table using its three side lengths.

Output one of the following statements for each record in the table:

SELECT 
CASE
    WHEN A=B AND B=C AND A=C THEN "Equilateral"
    WHEN (A=B OR B=C OR A=C) and ( A+B>C AND B+C>A AND A+C>B) THEN "Isosceles"
    WHEN (A!=B and B!=C and A!=C) and ( A+B>C AND B+C>A AND A+C>B) THEN "Scalene"
    ELSE "Not A Triangle"
END
FROM TRIANGLES