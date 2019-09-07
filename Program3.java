public class program3 

{
    public static void main(String[] args)
    {
        double i=3.0;
        double num=600851475143.0;
        while(i*i<num)
        {
            while(num%i==0)
            {
                num=num/i;
            }
            i++;
        }
        System.out.println(num+" is the largest prime factor");
    }
}
