public class Problem7
{

    
    /* returns the nth prime number */
    public static long main(String[] args) 
    {
        int numberOfPrimes = 0;
        long prime = 1;
        
        while (numberOfPrimes < 10001) 
        {
            prime++;
            if (IsItPrimeTho(prime)) 
            {
                numberOfPrimes++;
            }
        }
        return prime;
    }
    

    private static boolean IsItPrimeTho(long n) 
    {   
        if (n < 2) 
        return false;
        else if (n == 2) 
        return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
           { 
               if (n % i == 0)
                return false;                                
           }
       return true;
    }
}
