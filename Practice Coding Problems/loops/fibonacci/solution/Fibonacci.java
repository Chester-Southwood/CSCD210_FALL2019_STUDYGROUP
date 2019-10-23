public class Fibonacci
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(final int num)
    {
        if(num <= 2)
        {
         return 1;
        }
        else
        {
//          int prev1 = 1,
//              prev2 = 1,
//              copy  = num,
//              sum   = 0;
     
//          while(copy > 2)
//          {
//             sum = prev1 + prev2;;
//             prev1 = prev2;
//             prev2 = sum;
//             copy--;
//          }

    //instead of using while loop above
 
//          for(; copy > 2; copy--)
//          {
//             sum = prev1 + prev2;;
//             prev1 = prev2;
//             prev2 = sum;
//          }

            int sum = 0;

            for(int prev1 = 1, prev2 = 1, copy = num; copy > 2; copy--)
            {
                sum = prev1 + prev2;;
                prev1 = prev2;
                prev2 = sum;
            }

             return sum;
        }
    }
}
