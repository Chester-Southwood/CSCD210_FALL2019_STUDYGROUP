public class PerfectNumber
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println(i + " is a perfect number: " + isPerfect(i));
        }
    }

    public static boolean isPerfect(final int num)
    {
        int sum = 0;

        for(int i = 1; i < num; i++)
        {
            if(num % i == 0) //if is divisble, ex 6 % 2 = 0 as there is no remainder
            {
                sum += i;
            }
        }

        return sum == num;
    }
}
