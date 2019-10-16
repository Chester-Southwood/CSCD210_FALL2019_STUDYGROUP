__Methods__:

* ```java
  //methods have the basic structure of
  /*
  	//Signature of a method
  	visibility static/non-static returnType methodName (Parameters)
  	{
  		return returnType; //Return void if you are returning nothing.
  	}
  */
  ```

  * __Method Signature__: The header of a method. It can contain the same name in different methods of the class, but doing so you must change the parameter structure. (A method name does not have to be unique, but a method signature does have to be unique. A different method signature means if the parameter structure is changed you may also change or keep the same the visibility and or the return type)

  * ```java
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

  * All methods must __return__ the specified data type, unless throwing an exception (do not worry about for now). __UNLESS__ they are returning void in their method signature, meaning that you do not return any data type. Usually void methods are changing an object's attributes or are printing something to the terminal/screen.