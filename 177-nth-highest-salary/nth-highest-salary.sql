CREATE FUNCTION getNthHighestSalary(@N INT) 
RETURNS INT AS
BEGIN
    Declare @salary float;

    With a As(
        select distinct salary,
            dense_rank() over (order by salary desc) as rnk
        from employee    
    )

    select @salary = Max(Cast(salary as INT))
    from a 
    where rnk = @N;


    RETURN (
        /* Write your T-SQL query statement below. */
        @salary

    );
END