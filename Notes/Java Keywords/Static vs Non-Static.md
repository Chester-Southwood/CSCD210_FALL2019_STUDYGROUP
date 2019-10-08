**Static vs Non-Static:**

- **Static**: A instance of an object does not need to be made to use the respective method/field if have proper visibility from "outside world".

- **Non-Static**: A instance of a object needs to be created in order to use the respective methods or fields if have visibility from "outside world". (such as public)

  - Exceptions to this rule include the constructor to create the object, if non-private.

  - Non-Static methods usually are tied to that specified object, meaning that it may manipulate that object's attributes (fields/instance variables). Fields/Instance variables tell characteristics of the respective instance if non-static, meaning not all cat objects are named "ted". 

    - Example - We have a class called Kitty that has two fields. Those fields are initialized during construction of the object. Once set, they cannot be seen from the outside world besides through your get/set methods, this is a form of __Encapsulation__, a topic you'll learn more about in CSCD211. 

    - ```java
      public class Kitty
      {
          //Fields/Instance Variables (tied to this respective instance of the class, aka a object)
          private String name; //Private, outside world cannot see (outside class)
          private String color;
          
          //Default Value Constructor
          public Kitty()
          {
      		this.name  = "No name";
              this.color = "Tan";
          }
          
          //Explicit Value Constructor
          public Kitty(final String name, final String name)
          {
              this.name  = name;
              this.color = color;
          }
          
          public String getName()
          {
      		return this.name;
          }
          
              //Do not be lazy, attempt to make clean code and easy to read/understand variable names.
          public void setName(final String newName)
          {
              this.name = newName;
          }
          
          public String getColor()
          {
      		return this.color;
          }
          
          //Do not be lazy, attempt to make clean code and easy to read/understand variable names.
          public void setColor(final String newColor)
          {
              return this.color = newColor;
          }
      }
      ```
