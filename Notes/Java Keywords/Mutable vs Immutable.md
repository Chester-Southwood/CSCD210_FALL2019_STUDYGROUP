__Mutable vs Immutable__:

- Mutable: A variable itself can be changed. When a stylist cuts someone's hair, it is affecting that variable, it does not need to create a brand new one in memory that has cut hair.
  - Example - Human Object
    - When a human gets a year older, its age instance variable would most likely increase. We are changing that object's attributes, but we aren't making a whole new Human Object to make these changes, as we would with _String_. 
- Immutable: A variable that cannot be changed, a new variable must be copied with the specified changes.
  - Example - String
    - Whenever you make a new String via concatenation it is making a new String with the specified changes you are adding to it. This is due to the String class being a "boxed version" of a character array (Since that is all a array really is). Since it is an array, in order to make a new array that is of different size, you must make a copy of the old array with the specified changes. The String class does this by making a new String instead of reassigning the value of the same variable. __See [https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html](String Builder) to make Mutable String Object__
  - Example - Primitives
    - Primitives are values in memory that are predefined, meaning that whenever you assign a variable that value, you are pointing to a __new__ memory address to change your variable from 4 to 5, reassigning a value similar to String. 