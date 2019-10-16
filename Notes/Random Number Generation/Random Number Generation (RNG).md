# Random Number Generation (RNG)

Java has methods prebuilt within it's API to generate "random numbers". Why are there air quotes, this is due to the numbers not really being random. The algorithm used to calculate a random value is based on the System's internal time and other factors that can be predictable to users/attackers, so please be wary and use better methods for cases where you need a genuine random number (casino machines).

## java.lang.Math contains a method called random()

* The method returns a "random" value [0, 1) as a double. 

  * You can use this number by adding multipliers to it to increase it's range -> Math.random() * 50 = [0, 50).

  * You are also able to shift the value to where's it's starting. Math.random() + 12 -> [12,13) or Math.random() - 3 -> [-3, -2)

  * You can also combine these operations. Let's say you want to generate a number between 25 and 30.

  * ```java
    public static void generateRandom()
    {
        double randomValue             = Math.random();
        int min                        = 25, 
        	max                        = 30;
        int range                      = max - min;
        double randomValueRange        = randomValue * range;
        double randomValueRangeShifted = randomValueRange + min;
        return randomValueRangeShifted;
    }
    ```

  * It is really similar to graph shifts for polynomials algebra. Where multiplying expands the range of the polynomial, and adding/subtracting the polynomial moves it's starting point on the y-axis.