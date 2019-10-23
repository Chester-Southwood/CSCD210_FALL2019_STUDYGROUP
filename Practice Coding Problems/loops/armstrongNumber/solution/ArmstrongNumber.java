public class ArmstrongNumber
{
    public static void main(String[] args) 
    {
        for(int i = 0; i <= 2000; i++)
        {
            System.out.println(num + " is a armstrong number " + isArmstrong(num));
        }
    }

    public static boolean isArmstrong(final int num)
    {
        int nDigits = numOfDigits(num);

        int copy  = num,
            digit = 0,
            sum = 0;

        while(copy != 0)
        {
            digit = copy % 10;
            copy  /= 10;

            sum   += Math.pow(digit, nDigits);
        }

        return sum == num;
    }

    private static int numOfDigits(final int num)
    {
        int nDigits = 1;

        for(int i = 10; num / i != 0; i*=10)
        {
            nDigits++;
        }

        return nDigits;
    }
}
