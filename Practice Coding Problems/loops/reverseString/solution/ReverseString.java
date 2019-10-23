public class ReverseString
{
   public static void main(String[] args)
   {
      System.out.println(reverseString("ted") + " = " + "ted"); 
      System.out.println(reverseString("mom") + " = " + "mom");   
      System.out.println(reverseString("a")   + " = " + "a");   
      System.out.println(reverseString("")    + " = " + "");   
      System.out.println(reverseString("fedcba") + " = " + "abcdef");   
  
   
   
  public static String reverseString(final String str)
  {
      String newStr = "";
      for(int i = str.length() - 1; i >= 0; i--)
      {
         newStr += str.charAt(i);
      }
      return newStr;
  }
}