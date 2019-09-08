public class Program5
{
    public static void main()
    {
    long c = 21;
    while (true)
    {
        boolean blyat = true;
        for (int i = 1; i < 21; i++)
        {
            blyat = true;
            if ( c % i != 0 )
            {
            blyat = false;
            break;
            }
        }
        if ( blyat )
        {
            System.out.println( c );
            System.exit(0);
        }

        c++;
    }
    }
}
