# Multiple Choice

1. Java is a ____

   a. Procedure Programming Language

   b. Functional Programming Language

   c. Object Oriented Porgramming Language

   d. None of the above

2. Java code is is executed after compilation by the Java Virtual Machine?

   a. True

   b. False

3. Which of these can be returned and assigned to a variable.

   a. int

   b. void

   c. byte

   d. float

4. Which of the following is the biggest in size?

   a. short

   b. byte

   c. double

   d. float

5. A char variable corresponds to a int value on the askii table?

   a. True

   b. False

6. Strings are Mutable data types?

   a. True

   b. False

7. A infinite loop will cause a StackOverflowException

   a. True

   b. False

8. "bob" == "Joe" will return true? If False, explain why.

   a. True

   b. False

9. The Modular operator returns the number of times (n mod m) m can go inside n?

   a. True

   b. False

10. Which of the following is true?

    a. Java requires the programmer to manually allocate and deallocate memory.

    b. Java contains a Garbage Collector that takes care of memory allocation.

    c. None of the above

    d. A and B are True

11. The following will 

    ```java
    for(;;)
        System.out.println("Code is running");
    ```

    a. Cause a infinite loop

    b. Cause a compilation error

    c. Run one time and terminate

    d. Terminate as it will not go inside the for loop

12. Which of the following is not a Java visibility modifier?

    a. public

    b. private

    c. hidden

    d. protected

13. A DVC constructor is generated automatically.

    ```java
    //Example
    public StuUtils
    {
        public void printHello()
        {
            System.out.println("Hello World!");
        }
    }
    
    public class Tester
    {
        public static void main(String[] args)
        {
            StuUtils su = new StuUtils();
            su.printHello();
        }
    }
    ```

    a. True

    b. False

14. It is required to clear the buffer using kb.nextLine() (kb is instance of Scanner)?

    a. True

    b. False

15. A variable can be reinitialized and be redeclared?

    a. True

    b. False

______

# Definitions

16. Final:
17. Overload:
18. Scope:
19. Static:
20. Exception:

____

# Short Answer

21. Expected Output:

    a.  3 * 4 + 5 * 6 + 7 * -2  -> Output: 

    b.  1.5 * 2.0 + (5.5 / 2) + 5 / 4  -> Output:

    c.  23 % 5 + 31 / 4 % 3 - 17 % (16 % 10) -> Output:

    d.  "1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9)  -> Output:

    e.  345 / 10 / 3 * 55 / 5 / 6 + 10 / (5 / 2.0)  -> Output:

    f.  1 / 2 > 0 || 4 == 9 % 5 || 1 + 1 < 1 - 1  -> Output:

22. Given x = 17, y = 6; what is the expected output for each

    a. x + y / 3 = 

    b. x % y * 4 =

    c.  x – y / 3 =

    d.  x / 5 – y * 2  =

23. Given the passed in inputs for x, which is each respective output

    ```java
    //x = 2, 5, 8, 11
    //y = 4, 7, 16,10
    //z = 6, 14, 24, 4
    public void mysteryMethod(int x, int y, int z)
    {
        if(x % y == 0)
            System.out.println(y % x)
        else if(y == z)
            System.out.println(x + y - z);
        else 
            System.out.println(z % x % y / 1);
    }
    ```

24. Given the following, find 3 syntax errors:

    ```java
    public static void findBiggest(final int numA, final int numB)
    {
        if(num1 > num2)
            num1 = 0;
        else
        {
            else if(numA % numB == 0)
                return numA;
            else
                return numB;
        }
    }
    ```

25. Given the following, explain what the method does

    ```java
    public static boolean mysteryMethod(final String a)
    {
    	boolean isTrue = false;
        for(int i = 0; i < a.length(); i++)
        {
            int value = (int)a.charAt(i);
            if( 65 <= value && value <= 90)
                isTrue = true;
        }
        return isTrue;
    }
    ```

26. Covert the following into a __Valid__ java statement: 3.2<= num <= 12

27. Given the scores of a grade, create a function that takes in a __int__ score and returns a respective uppercase char.

    | Score       | Grade |
    | ----------- | ----- |
    | 8 < x <= 10 | A     |
    | 7 < x <= 8  | B     |
    | 6 < x <= 7  | C     |
    | 5 < x <= 6  | D     |
    | 5 <= x      | F     |

    a. __Using if statements__ 

    b. __Using Switch Statements__

28. Create a function that determines if a given __int__ is prime, return true or false.

29. Create a function that has no parameters, prompts the user for a number greater then 25 but less than 31. If the user doesn't type in the right range, reprompt with a __helpful message__ and get input from user again. Return the input with correct range. __note__: Happy Stu Land, only int will be typed in by user.

30. Create a method that calculates the __Harmonic Sequence__ from a positive, non-zero n. The harmonic series is calculated by adding fractions with increasing denominators of one. 

    ![](https://steemitimages.com/640x0/http://i.imgur.com/CZAOcuo.png)

    * The Harmonic Series is a series learned in calc III that shows a pattern that diverges, meaning it does not have a set limit, or does not converge to a certain limit. (You do not need to know this, but little trivia)

31. Create a function, without using modulo, to determine if the passed in num1 is divisible by the passed in num2, return a boolean.
32. Write a single line of code that casts a int to a char, do not worry about the range of the int, assign it to a new variable that is a char called x.
33. Create a function that calculates the average of a passed in array. A average is determined by the sum of all the values divided by the total number of values. [3+2 + 1 + 5] / 4. Return the value as a double.
34. Given a passed in Scanner, use it to read a String, double, and int into variables x, y, z respectively. You do not need to worry about clearing buffer, do not prompt user for input.
35. Explain what "clearing the buffer" means?
