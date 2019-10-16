# Looping

Definition: A piece of code that runs continuously until a condition is no longer met. i.e condition == false or !isTrue != false

Purpose: To reduce the amount of code for the same operation.

```java
//Way 1 = Bad way
public static void print100()
{
    System.out.printf("%d\n", 1);
    System.out.printf("%d\n", 1);
    System.out.printf("%d\n", 1);
	//...
    System.out.printf("%d", 100)
}
//Way 2 = Better way with looping
public static void print100()
{
    for(int index = 1; index <= 100; index++)
    {
        System.out.printf("%d", i);
    }
}
//Way 3 = Better way with looping and method reusing
public static void print100()
{
    printRangeHelper(0, 100);
}
//private helper method that takes in ranges so you can easily change or use in other functions. Private so outside world cannot see or use method, you can use it to help in other functions as you see fit.
private static void printRangeHelper(final int min, final int max)
{
    for(int index = min; index < max; index++)
    {
        System.out.printf("%d\n", index)
    }
    //If you do not want to print empty \n after printing all values
    System.out.printf("%d", max);
}
```

## For Loop

Definition: A loop while you \*optionally define\* the starting value / instance of a variable, and increment to a destination value to stop the loop condition.

```java
/*
* 	for(variableType name = value; boolean condition; increment name)
  	{
		//Code
	}
	//Breaks out of code
*/

//Example with value
public static void printReverseRange(final int min, final int max)
{
    for(int index = max; index >= max; index--)
    {
        System.out.println(index);
    }
}

//Example with \*Optional Values\*
public static void printReverseRange2(final int min, final int max)
{
    int index = max;
    /*
    	Essentially a WHILE loop, better to just do while instead of for in this case.
    */
    for(/*optional declare and or set value*/; index >= min; /*optional incrementor*/)
    {
        System.out.println(index);
        index--;
    }
}

//Example with Scanner
public static void readFile(final String fileName)
{
    //Since scanner increments and returns value, we shouldn't increment scanner in for loop header if we want to keep value. So in this case we used instead to keep track of which line we are in the file we are reading and outputing to the terminal/console.
    int pageNum = 1;
    for(Scanner sc = new Scanner(new File(fileName)); sc.hasNextLine(); pageNum++)
    {
		System.out.println("Page " + pageNum + ": " + sc.nextLine());
    }
}
```

**When to Use:** Recommended to use when you know the starting and ending point / goal.

Cases 

* Arrays:	[1,2,3,4,...,n]
* Scanner:    Scanner kb
* LinkedLists:  Head -> Node -> Null (211 concept, don't worry about it for now)
* Ranges:   [n, m)

## Enhanced For Loop (For-Each Loop)

Definition: Loop used for going through each element in a data structure. This is the primary use case.

```java
/*
*	for(dataTypeOfElement currentElementInDataStructure : DataStructure)
*	{
*		//code
*	}
}
*/

public static void printArr(final int[] arr)
{
    for(int element : arr)
    {
        System.out.println(element);
    }
}
```

__When to Use:__ Recommended when you want to go through all elements of data structure.

* Doing this way allows you to not worry about going out of bounds or null values.

## While Loop

Definition: Loop that will run while condition is true.

```java
/*
* while(condition) //condition == true, better doing the boolean value instead of == true
* {
*	//code
* }
*/

/*Happy Stu Land*/
public static int promptForPositiveValue()
{
    Scanner sc = new Scanner(System.in);
    int input = Integer.valueOf(sc.nextLine());
    System.out.print("Please type in a positive value: ");
    while(input < 0)
    {
        if(input < 0)
        {
            System.out.print("Please try again, please type in a positive value: ");
        	input = Integer.valueOf(sc.nextLine());
        }
    }
    return input;
}

/*Not Happy Stu Land*/
public static int promptForPositiveValue()
{
    Scanner sc = new Scanner(System.in);
    int input = -1;
    System.out.print("Please type in a positive value: ");
    while(input < 0)
    {
        try
        {
			input = Integer.valueOf(input);
            if(input < 0)
            {
                System.out.print("Please try again, please type in a positive value: ");
            }
        }
        catch(NumberFormatException e) //you're in happy stu land, just showing when you aren't in happy stu land. 
        {
			System.out.print("Please try again, cannot accept non-int values, please type in a positive value: ")
        }
    }
    return input;
}
```

__When to use__: When you don't know when the loop condition will stop. In the above case it will only stop once the user enters a positive value, or "unplugs the computer".

## Do While Loop

Definition: Loop where the condition is checked after the first loop iteration.

```java
/*
*do
*{
*	//code
*while(condition == true);
*/

/*Happy Stu Land*/
public static int promptForNegativeValue()
{
    Scanner sc = new Scanner(System.in);
    int input;
    boolean isLessThan0 = false;
    System.out.print("Please type in a negative value: ");
    do {
        input = Integer.valueOf(input);
        isNegative = input < 0;
        if(!isNegative) //better to do !boolean then to do boolean == false by standards
        {
            System.out.print("Please try again, please type in a negative value: ");
        }
    } while(isNegative);
    return input;
}
```

# Edge cases for loops

### Running into Exceptions

![](https://i.redd.it/6wksqjmmyw321.jpg)

As mentioned, some loops you are able to go into memory territory you haven't declared/allocated. 

* For
* While
* Do While

Using __Enhanced For Loop__ plays it safe to go through all elements unless you __Break__ out of the loop on your own. 

### Stopping on the right condition

* __Break__ and __Continue__ are keywords in java that allow you to break out of a loop and continue from a loop call respectively. They are generally frowned upon in modern standards as it essentially __Pulling the carpet from right under your program__ instead of __Gracefully exiting the loop by not meeting the conditional statement__.

![](https://i.imgur.com/IDTeqdm.jpg)

```java
//Examples of gracefully ending early on loops

//Example 1
public static void comeToBargain()
{
       boolean winBargain = false;
       String[] quoteArr = new String[] {"You've come to die. Your world is now my world. Like all worlds.", "You've come to die. Your world is now my... What is this? Illusion?\nNo, this is real.\nGood.", "What is happening?\nSince you gave Kaecilius power from your dimension, I brought some power from mine. This is time. Endless, looped time!\nYou dare?", "You cannot do this for ever.\nActually, I can. This is how things are now! You and me. Trapped in this moment. Endlessly.\nThen you will spend eternity dying!\nYes, but everyone on Earth will live.\nBut you will suffer!\nPain's an old friend.", "End this! You will never win.\nNo. But I can lose. Again. And again. And again. Forever. That makes you my prisoner.\nNo! Stop! Make this stop! Set me free!\nNo! I've come to bargain!\nWhat do you want?\nTake your zealots from the Earth. End your assault on my world. Never come back. Do it and I'll break the loop.\nFine!"};
       do
       {
       	   int randomIndex = (int)(Math.random() * quoteArr.length); 
           if(randomIndex != quoteArr.length - 1)
           {
               System.out.println("Dormammu, I've come to bargain!");
           }
           else
           {
               winBargain = true;
           }
           System.out.printf("%s\n\n",quoteArr[randomIndex]);
       }while(!winBargain);
}

//Example 2
String[] nameArr = new String[]{"Christopher", "Tiger", "Rabbit", "Pooh", "Piglet", "Eor"};
String name = "pooh";
public static int containsName(final String[] arr, final String name)
{
    boolean hasFoundName  = false;
    String  lowerCaseName = name.toLowerCase();
    
    //for loop continues until out of bounds of array or if finds name in array
    for(int index = 0; index < arr.length && !hasFoundName; index++)
    {
        if(name.toLowerCase().equals(lowerCaseName())
        {
           hasFoundName = true;
        }
    }
           
    return foundName
}
```

### Infinite Loop

Definition: Loop continues to run without breaking out of it's condition.

![](https://images7.memedroid.com/images/UPLOADED106/57191abb80b6b.jpeg)

```java
//Examples
while(true)
{
    //code
}
do
{
    if()//some reason you resetting the condition on accident
    {
    	value = false;
    }
}while(!value);
for(;;)
{
    //code
}
for(int i = 0; i < 20; i--) //You accidentlly go the wrong direction when looping.
{
    //code
}
```

Again, for loops are the only loops that will guarantee you a infinite loop will never occur. This does not mean that it's the best loop, there are times and cases to use any of these loops.