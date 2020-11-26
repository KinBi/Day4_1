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
    int i = 1;
    int j = 2;
    while (i < intArray.size()) {
      if (intArray.get(i - 1) <= intArray.get(i)) {
        i = j;
        j++;
      } else {
        int tmp = intArray.get(i - 1);
        intArray.set(i - 1, intArray.get(i));
        intArray.set(i, tmp);
        i--;

        if (i == 0) {
          i = j;
          j++;
        }
      }
    }
  }

  public void bubbleSort(IntArray intArray) {
    boolean sorted = false;

    while(!sorted) {
      sorted = true;
      for (int i = 0; i < intArray.size() - 1; i++) {
        if (intArray.get(i) > intArray.get(i + 1)) {
          int temp = intArray.get(i);
          intArray.set(i, intArray.get(i + 1));
          intArray.set(i + 1, temp);
          sorted = false;
        }
      }
    }
  }

  public void shuffle(IntArray intArray) {
    Random random = new Random();

    int size = intArray.size();
    for (int i = 0; i < size; i++) {
      int randomIndex = random.nextInt(size);
      int tmp = intArray.get(i);
      intArray.set(i, intArray.get(randomIndex));
      intArray.set(randomIndex, tmp);
    }
  }

  public boolean isSortedAsc(IntArray intArray) {
    boolean sorted = true;

    int i = intArray.size() - 1;

    while (i > -1) {
      if (intArray.get(i - 1) > intArray.get(i)) {
        sorted = false;
        break;
      }

      i--;
    }

    return sorted;
  }

  public boolean isSortedDesc(IntArray intArray) {
    boolean sorted = true;

    int i = intArray.size() - 1;

    while (i > -1) {
      if (intArray.get(i - 1) < intArray.get(i)) {
        sorted = false;
        break;
      }

      i--;
    }

    return sorted;
  }
}
