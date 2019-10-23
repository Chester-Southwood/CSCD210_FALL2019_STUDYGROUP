# Armstrong Number

![](https://i.ytimg.com/vi/vSCmfIl-sHg/hqdefault.jpg)

* A Armstrong Number is a number whose digits multiplied to the numberOfDigits power summed together equals itself.
* Examples of Armstrong Numbers:
  * 4       = 4 ^ 1 = 4
  * 153   = 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125 + 27 = 153
  * 1634 = 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 = 1 +  1296 + 81 + 256 = 1634

## Tip

* You will need to count the number of digits of the passed in int before you can determine if it is a Armstrong Number.
  * You could make a private method to be called upon to delegate this task. It is important to be able have a [Single Responsibility](https://en.wikipedia.org/wiki/Single_responsibility_principle) for your methods and classes in the present and future!

## Method Header / Signature

```java public static boolean isArmstrong(final int num)
public static boolean isArmstrong(final int num)
```

