public class IntToBinary
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println(i + " to binary is: " + intToBinary(i));  
        }
    }
   
    public static int intToBinary(final int num)
    {
        int power = 0;
        for(; Math.pow(2,power) <= num; power++);

        int value = 0;
        int numCopy = num;
        for(; power >= 0; power--)
        {
            if(numCopy >= Math.pow(2, power))
            {
                numCopy -= Math.pow(2, power);
                value *= 10;
                value += 1;
            }
            else
            {
                value *= 10;
            }
        }
        return value;
    }
}
