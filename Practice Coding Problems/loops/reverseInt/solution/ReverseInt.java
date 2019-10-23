public class ReverseInt
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println(reverseInt(i));
        }
    }

    public static int reverseInt(final int num)
    {
      int reverseNum = 0,
          copyNum    = num,
          digit;
          
      while(copyNum != 0)
      {
         digit       = copyNum % 10;
         reverseNum *= 10;
         reverseNum += digit;
         copyNum    /= 10;
      }
      
      return reverseNum;
    }
}
