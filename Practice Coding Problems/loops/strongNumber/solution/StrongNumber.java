public class StrongNumber
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i++)
        {
            if(isStrong(i))
            {
                System.out.println(i + " is a strong number");
            }
        }
    }

    public static boolean isStrong(final int num)
    {
        int copy  = num,
        digit = 0,
        sum   = 0;

        while(copy != 0)
        {
            digit = copy % 10;
            copy  /= 10;
            sum += factorial(digit);
        } 

        return sum == num;
    }

    public static int factorial(final int num)
    {
        int sum = 1;
        for(int i = 2; i <= num; i++)
        {
            sum *= i;
        }
        return sum;
    }
}
