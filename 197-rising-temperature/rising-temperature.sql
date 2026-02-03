/* Write your T-SQL query statement below */

Select id 
From (
select id,
recordDate, temperature,
LAG(temperature) OVER (Order by recordDate) as prevTemp,
LAG(recordDate) OVER (Order by recordDate) as prevDate
From 
Weather) W
where W.temperature > W.prevTemp
and W.prevDate = DATEADD(Day, -1, W.recordDate)