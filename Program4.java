public class Program4
{
    private static long reversed(long n)
    {
        long reverse = 0;
        long last;
        while(n>0)
        {
            last=n%10;
            reverse=(reverse*10)+last;
            n=n/10;
        }
        return reverse;
    }
    
    private static boolean isitPalindrome(long n )
    {       
        return reversed(n) == n;
    }


    public static void main(String[] args)
    {
        long bigboi = 0;

        int a1 = 999, b1 = 999; // doing it from 999 is easier to get the highest palindrome number.
        for (int b2 = b1; b2 > 0; b2--)
            {
                for (int a2 = a1; a2 > 0; a2--)
                {
                    if ( isitPalindrome(a2*b2))
                    {
                        if ( a2*b2 > bigboi )
                        {
                            bigboi = a2*b2;
                        }
                    }
                }
            }

    System.out.println(bigboi);
    }
}
