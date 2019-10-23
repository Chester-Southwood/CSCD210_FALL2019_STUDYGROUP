public class Factorial
{
   public static void main(String[] args)
   {
      for(int i = 0; i < 100; i++)
      {
         System.out.println(factorial(i));  
      }
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
