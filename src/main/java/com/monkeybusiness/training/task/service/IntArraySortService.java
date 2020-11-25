package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.IntArray;

import java.util.Random;

public class IntArraySortService {
  public void monkeySort(IntArray intArray) {
    while (!isSortedAsc(intArray)) {
      shuffle(intArray);
    }
  }

  public void gnomeSort(IntArray intArray) {
    int[] array = intArray.getValues();
    int i = 1;
    int j = 2;
    while (i < array.length) {
      if (array[i - 1] <= array[i]) {
        i = j;
        j++;
      } else {
        int tmp = array[i - 1];
        array[i - 1] = array[i];
        array[i] = tmp;
        i--;

        if (i == 0) {
          i = j;
          j++;
        }
      }
    }

    intArray.setValues(array);
  }

  public void bubbleSort(IntArray intArray) {
    int[] array = intArray.getValues();
    boolean sorted = false;

    while(!sorted) {
      sorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          sorted = false;
        }
      }
    }

    intArray.setValues(array);
  }

  public void shuffle(IntArray intArray) {
    Random random = new Random();
    int[] array = intArray.getValues();

    for (int i = 0; i < array.length; i++) {
      int randomIndex = random.nextInt(array.length);
      int tmp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = tmp;
    }

    intArray.setValues(array);
  }

  public boolean isSortedAsc(IntArray intArray) {
    boolean sorted = true;

    int[] array = intArray.getValues();
    int i = array.length - 1;

    while (i > -1) {
      if (array[i - 1] > array[i]) {
        sorted = false;
        break;
      }

      i--;
    }

    return sorted;
  }

  public boolean isSortedDesc(IntArray intArray) {
    boolean sorted = true;

    int[] array = intArray.getValues();
    int i = array.length - 1;

    while (i > -1) {
      if (array[i - 1] < array[i]) {
        sorted = false;
        break;
      }

      i--;
    }

    return sorted;
  }
}
