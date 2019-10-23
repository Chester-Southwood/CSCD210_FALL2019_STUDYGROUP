public class SumDigits
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println(sumDigits("The sum of digits for " + i " is: " + sumDigits(i)));
        }
    }

    public static int sumDigits(final int num)
    {
        int sum     = 0,
            digit   = 0,
            remainder = num;

        while(remainder != 0)
        {
            digit     = remainder % 10;
            remainder = remainder / 10; 
            sum      += digit;
        }

        return sum;
    }
}
