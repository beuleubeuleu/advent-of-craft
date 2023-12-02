package games;

public class FizzBuzz {

  public static String convert(Integer input) throws OutOfRangeException {
    
    isOutOfRange(input);

    if (input % 3 == 0 && input % 5 == 0) {
      return "FizzBuzz";
    }

    if (input % 3 == 0) {
      return "Fizz";
    }

    if (input % 5 == 0) {
      return "Buzz";
    }

    return input.toString();
  }

  private static void isOutOfRange(Integer input) throws OutOfRangeException {
    if (input <= 0 || input > 100) {
      throw new OutOfRangeException();
    }
  }
}
