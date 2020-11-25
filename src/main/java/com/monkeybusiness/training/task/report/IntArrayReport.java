package com.monkeybusiness.training.task.report;

import com.monkeybusiness.training.task.entity.IntArray;

public class IntArrayReport {
  public void printIntArray (IntArray intArray) {
    System.out.println("Array: " + intArray.toString());
  }

  public void printBubbleSortedIntArray(IntArray intArray) {
    System.out.println("Bubble sorted array: " + intArray.toString());
  }

  public void printGnomeSortedIntArray(IntArray intArray) {
    System.out.println("Gnome sorted array: " + intArray.toString());
  }

  public void printMonkeySortedIntArray(IntArray intArray) {
    System.out.println("Monkey sorted array: " + intArray.toString());
  }

  public void printFibonacciArray (IntArray intArray) {
    System.out.println("Fibonacci numbers array: " + intArray.toString());
  }

  public void printPrimeArray (IntArray intArray) {
    System.out.println("Prime numbers array: " + intArray.toString());
  }

  public void printUniqueDigitsArray (IntArray intArray) {
    System.out.println("UniqueDigits array: " + intArray.toString());
  }
}
