public class Prime
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println(i + " is prime: " + isPrime(i));
        }
    }

    public static boolean isPrime(final int num)
    {
        boolean isPrimeFlag = true;

        for(int i = 2; i < num && isPrimeFlag; i++)
        {
            if(num % i == 0)
            {
                isPrimeFlag = false;
            }
        }

        return isPrimeFlag;
    }
}
