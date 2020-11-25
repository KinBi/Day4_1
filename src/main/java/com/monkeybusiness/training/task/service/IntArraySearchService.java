package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.IntArray;

import java.util.function.IntPredicate;

public class IntArraySearchService {

  public int binarySearch(IntArray intArray, int value) throws IllegalArgumentException {
    IntArraySortService intArraySortService = new IntArraySortService();

    if (!intArraySortService.isSortedAsc(intArray)) {
      throw new IllegalArgumentException("Array is not sorted");
    }

    int[] array = intArray.getValues();

    int first = 0;
    int last = array.length - 1;

    while (first <= last){
      int mid = (first + last) >>> 2;
      int midVal = array[mid];

      if (midVal < value){
        first = mid + 1;
      } else if (midVal > value){
        last = mid - 1;
      } else {
        return mid;
      }
    }

    return -1;
  }

  public IntArray findAll(IntArray intArray, IntPredicate intPredicate){
    IntArray array = new IntArray();

    for(int a : intArray.getValues()){
      if (intPredicate.test(a)){
        array.add(a);
      }
    }

    return array;
  }

  public IntArray findAllPrime(IntArray intArray) {
    IntService intService = new IntService();
    IntArray array = findAll(intArray, intService::isPrime);

    return array;
  }

  public IntArray findAllFibonacci(IntArray intArray) {
    IntService intService = new IntService();
    IntArray array = findAll(intArray, intService::isFibonacci);

    return array;
  }

  public IntArray findAllWithUniqueDigits(IntArray intArray) {
    IntService intService = new IntService();
    IntArray array = findAll(intArray, intService::isUniqueDigits);

    return array;
  }

  public int findMax(IntArray intArray) {
    int[] array = intArray.getValues();
    int max = array[0];
    int i = 0;

    while (i < array.length) {
      if (max < array[i]) {
        max = array[i];
      }

      i++;
    }

    return max;
  }

  public int findMin(IntArray intArray) {
    int[] array = intArray.getValues();
    int min = array[0];
    int i = 0;

    while (i < array.length) {
      if (min > array[i]) {
        min = array[i];
      }

      i++;
    }

    return min;
  }
}
