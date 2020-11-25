package com.monkeybusiness.training.task.main;

import com.monkeybusiness.training.task.creator.IntArrayCreator;
import com.monkeybusiness.training.task.entity.IntArray;
import com.monkeybusiness.training.task.report.IntArrayReport;
import com.monkeybusiness.training.task.service.IntArraySearchService;
import com.monkeybusiness.training.task.service.IntArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  private static final Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    int size = 10;

    logger.info("Test file logging");
    IntArrayCreator intArrayCreator = new IntArrayCreator();

    IntArray intArray = intArrayCreator.createIntArrayWithRandomValues(size);

    IntArrayReport report = new IntArrayReport();
    report.printIntArray(intArray);

    IntArraySearchService searchService = new IntArraySearchService();

    try {
      int index = searchService.binarySearch(intArray, 777);
    } catch (IllegalArgumentException e) {
      logger.error("Exception was caused " + e);
    }

    IntArray intArray1 = searchService.findAllFibonacci(intArray);
    report.printFibonacciArray(intArray1);

    intArray1 = searchService.findAllPrime(intArray);
    report.printPrimeArray(intArray1);

    intArray1 = searchService.findAllWithUniqueDigits(intArray);
    report.printUniqueDigitsArray(intArray1);

    IntArraySortService sortService = new IntArraySortService();
    sortService.bubbleSort(intArray);
    report.printBubbleSortedIntArray(intArray);

    intArray = intArrayCreator.createIntArrayWithRandomValues(size);
    report.printIntArray(intArray);

    sortService.gnomeSort(intArray);
    report.printGnomeSortedIntArray(intArray);
  }
}
