public class BinaryToInt
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println(i + " to int is: " + binaryToInt(i));  
        }
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
}
