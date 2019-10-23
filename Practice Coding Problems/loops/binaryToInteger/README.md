# Binary to Integer

![](https://miro.medium.com/max/479/1*BcOUj0kJPELq94KO8slYmA.jpeg)

- __Binary Numbers__ are on a base two format, meaning that it contains only ones and zeros. 
  - 1101
  - 111
  - 1
- __Decimal Numbers__ are on a base ten format, meaning it contains zero through nine.
  - 13
  - 6
  - 1

## Tip

- You will need to go through each digit and add to the sum the digit to the respective power.
  - 1101 = 1 * 2 ^ 3 + 1 *  1* 2 ^ 2 + 0 * 2 ^ 2 + 1 * 2 ^ 0 = 8 + 4 + 0 + 1 = 13

## Method Header / Signature

```java public static boolean isArmstrong(final int num)
public static int binaryToInteger(final int binary)
```

