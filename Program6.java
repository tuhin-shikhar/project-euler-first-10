public class Program6
{
    private long SumOfSquares()
    {
        long total = 0;
        for ( int i = 1; i < 101; i++)
        {
            total += i*i;
        }

        return total;
    }

    private long SquareOfSums()
    {
        long total = 0;
        for ( int i = 1; i < 101; i++ )
        {
            total += i;
        }
        return total*total;
    }

    public long answer()
    {
        return SquareOfSums() - SumOfSquares();
    }
}
