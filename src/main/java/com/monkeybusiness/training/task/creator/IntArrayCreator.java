package com.monkeybusiness.training.task.creator;

import com.monkeybusiness.training.task.entity.IntArray;

import java.util.Random;

public class IntArrayCreator {
  public static final int MAX_VALUE = 100;

  public IntArray createIntArrayWithRandomValues(int size) {
    IntArray intArray = new IntArray(size);
    Random random = new Random();

    for (int i = 0; i < size; i++) {
      int value = random.nextInt(MAX_VALUE);
      intArray.set(i, value);
    }

    return intArray;
  }

  public IntArray createIntArrayWithValues(int[] values) {
    IntArray intArray = new IntArray(values);

    return intArray;
  }
}
