public class ArmstrongNumber
{
   public static void main(String[] args)
   {
      for(int i = 0; i < 100; i++)
      {
         if(isArmstrong(i))
         {
            System.out.println(i);  
         }
      }
   }
   
  public static boolean isArmstrong(final int num)
  {
       int copy  = num,
           digit = 0,
           sum = 0;

       while(copy != 0)
       {
        digit = copy % 10;
        copy  /= 10;
   
        sum   += Math.pow(digit, 3);
       }

      return sum == num;
  }
}
