/*
Consider  and  to be two points on a 2D plane where  are the respective minimum and maximum values of Northern Latitude (LAT_N) and  are the respective minimum and maximum values of Western Longitude (LONG_W) in STATION.

Query the Euclidean Distance between points  and  and format your answer to display  decimal digits.

Input Format

The STATION table is described as follows:

Station.jpg

where LAT_N is the northern latitude and LONG_W is the western longitude.
*/

/*
Enter your query here.
*/

SELECT FORMAT(SQRT(POWER(MAX(LONG_W) - MIN(LONG_W),2) + POWER(MAX(LAT_N) - MIN(LAT_N),2)),4) FROM Station;
