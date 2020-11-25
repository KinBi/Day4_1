package com.monkeybusiness.training.task.service;

public class IntService {
  public boolean isUniqueDigits(int value) {
    String strValue = String.valueOf(value);

    if (strValue.length() == 1){
      return true;
    }

    boolean unique = true;

    int i = 0;

    while (i < strValue.length() - 1) {
      int j = i + 1;

      while (j < strValue.length()) {
        if (strValue.charAt(i) == strValue.charAt(j)) {
          unique = false;
          break;
        }

        j++;
      }

      if (!unique) {
        break;
      }

      i++;
    }

    return unique;
  }

  public boolean isPrime(int num) {
    if (num == 0) {
      return false;
    }

    boolean prime = true;
    int i = 2;
    int count = 1;

    while (i <= num / 2) {
      if (num % i == 0) {
        count++;
      }

      if (count > 1) {
        prime = false;
        break;
      }

      i++;
    }

    return prime;
  }

  public boolean isFibonacci(int value) {
    double first = 5 * Math.pow(value, 2) + 4;
    double firstSqrt = Math.sqrt(first);

    double second = 5 * Math.pow(value, 2) - 4;
    double secondSqrt = Math.sqrt(second);

    return isInteger(firstSqrt) || isInteger(secondSqrt);
  }

  public boolean isInteger(double value) {
    return (int) value == value;
  }
}
