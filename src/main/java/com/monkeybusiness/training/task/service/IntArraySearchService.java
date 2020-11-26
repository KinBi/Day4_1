package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.IntArray;

import java.util.function.IntPredicate;

public class IntArraySearchService {

  public int binarySearch(IntArray intArray, int value) throws IllegalArgumentException {
    IntArraySortService intArraySortService = new IntArraySortService();

    if (!intArraySortService.isSortedAsc(intArray)) {
      throw new IllegalArgumentException("Array is not sorted");
    }

    int first = 0;
    int last = intArray.size() - 1;

    while (first <= last){
      int mid = (first + last) >>> 2;
      int midVal = intArray.get(mid);

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

    for(int i = 0; i< intArray.size(); i++){
      int value = intArray.get(i);
      if (intPredicate.test(value)){
        array.add(value);
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
    int max = intArray.get(0);
    int i = 0;

    while (i < intArray.size()) {
      if (max < intArray.get(i)) {
        max = intArray.get(i);
      }

      i++;
    }

    return max;
  }

  public int findMin(IntArray intArray) {
    int min = intArray.get(0);
    int i = 0;

    while (i < intArray.size()) {
      if (min > intArray.get(i)) {
        min = intArray.get(i);
      }

      i++;
    }

    return min;
  }
}
