# Methods

* [Overview](##Overview) 

* [Method Signature:](#Method-Signature:)
  * [Method Return Notes](###Return) 
* [Method Precondition and Postcondition:](##Method-Precondition-and-Postcondition:)

___

## Overview

```java
//methods have the basic structure of
/*
	//Signature of a method
	visibility static/non-static returnType methodName (Parameters)
	{
		return returnType; //Return void if you are returning nothing.
	}
*/
```

## __Method Signature__: 

The header of a method. It can contain the same name in different methods of the class, but doing so you must change the parameter structure. (A method name does not have to be unique, but a method signature does have to be unique. A different method signature means if the parameter structure is changed you may also change or keep the same the visibility and or the return type)

```java
public class CodingMonkey
{
    public static void writeCode()
    {
		System.out.println("Monkey is writing code");
    }
    
    private static void writeCode(final String message)
    {
		System.out.println(message);
    }
    
    String writeCode(final String message, final boolean isCoding)
    {
        if(isCoding)
        {
            return message;
        }
        else
        {
            return "Monkey is writing code";
		}
    }
}
```

### Return

All methods must __return__ the specified data type, unless throwing an exception (do not worry about for now). __UNLESS__ they are returning void in their method signature, meaning that you do not return any data type. Usually void methods are changing an object's attributes or are printing something to the terminal/screen

## Method Precondition and Postcondition:

__Pre__-*Condition* and __Post__-*Condition* are conditions to check before before and after executing a piece of code respectively.

​	Example. You are writing a method that divides two numbers and returns a float.

__You cannot divide a number by zero, so you would want to check if the denominator number is 	zero before attempting to calculate.__

```java
public static void divideNum(final int numOne, final int numTwo)
{
    //int result = numOne / numTwo; Can throw an error without checking
    if(numTwo == 0)
    {
        //Or throw new IllegalArgumentException("Cannot divide by zero!")
		System.out.println("Cannot divide by zero!");
    }
    else
    {
        int result = numOne / numTwo; 
        System.out.println(numOne + " / " + numTwo " = " numOne);
    }
}
```

