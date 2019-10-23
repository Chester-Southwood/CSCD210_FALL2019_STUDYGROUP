public class NumOfDigits
{
    public static void main(String[] args) 
    {
        for(int i = 0; i <= 2000; i+=4)
        {
            System.out.println(num + " has " + numOfDigits(num) + " digits");
        }
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
