public class Problem10ver2
 {

    /* returns true if parameter n is a prime number,*/
    private static boolean isOptimusPrime(long n) 
    {
        int counter=0;
        long sqroot=(long)Math.sqrt(n);
        for (int x=1;x<=sqroot;x++)
        {
         if(n%x==0)
         counter++;
         else if(counter>1)
         return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        long sum = 0;   
        for (int i = 0; i < 2000000; i++)
            if (isOptimusPrime(i))
                sum += i;

        System.out.print(sum);
    }
}
