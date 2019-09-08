public class Program6
{
    private static long sumOfSquares()
    {
        long total = 0;
        for ( int i = 1; i < 101; i++)
        {
            total += i*i;
        }

        return total;
    }

    private static long squareOfSums()
    {
        long total = 0;
        for ( int i = 1; i < 101; i++ )
        {
            total += i;
        }
        return total*total;
    }

    public static long main()
    {
        return squareOfSums() - sumOfSquares();
    }
}
