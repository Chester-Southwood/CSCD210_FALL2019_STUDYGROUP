public class ToPutInPractice
{
  public static void main(String[] args)
  {
//     System.out.println("isArmstrong " + isArmstrong(371));
//     System.out.println(factorial(0));
//     System.out.println(isStrong(145));
//         System.out.println(intToBinary(254));
//     System.out.println(binaryToInt(11111110));
//     System.out.println(fibonachi(11));
//     System.out.println(isPerfect(5));
    System.out.println(reverseInt(1));
    System.out.println(reverseString("DAB NAM"));
    
//     for(int i = 1; i < 100; i++)
//     {
//       if(isPrime(i))
//       {
//          System.out.println(i);
//       }
//     }
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
  
  public static int binaryToInt(final int binary)
  {
   int binaryCopy = binary,
       sum        = 0,
       digit;
       
   for(int i = 0; binaryCopy != 0; i++)
   {
      digit = binaryCopy % 10;
      sum += digit * Math.pow(2, i);
      binaryCopy /= 10;
   }
   
   return sum;
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
  
  public static boolean isPrime(final int num)
  {
      boolean isPrimeFlag = true;
      
      for(int i = 2; i < num && isPrimeFlag; i++)
      {
         if(num % i == 0)
         {
            isPrimeFlag = false;
         }
      }
      
      return isPrimeFlag;
  }
  
  public static int fibonachi(final int num)
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