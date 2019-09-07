public class Program4
{
    public boolean isitPalindrome( String s )
    {       
        if ( s.length() % 2 != 0 )
        {
            s = s.substring( 0, s.length() / 2 ) + s.substring( (s.length() / 2) + 1);
        }

        return new StringBuffer( s.substring( 0, s.length() / 2) ).
                                 reverse().toString().equals( s.substring( s.length() / 2) );
    }


    public static void main(String[] args)
    {
        Program4 e = new Program4();
        long bigboi = 0;

        int a1 = 999, b1 = 999; // doing it from 999 is easier to get the highest palindrome number.
        for (int b2 = b1; b2 > 0; b2--)
            {
                for (int a2 = a1; a2 > 0; a2--)
                {
                    if ( e.isitPalindrome( new Long(a2*b2).toString() ) )
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
