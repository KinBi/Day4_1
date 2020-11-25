package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.IntArray;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntArraySearchServiceTest {
  IntArraySearchService intArraySearchService;
  IntArray intArray;

  @BeforeMethod
  public void setUp() {
    intArraySearchService = new IntArraySearchService();
    int[] array = {234, 54, 235, 65, 768, 236, 4548, 345, 7, 8};
    intArray = new IntArray(array);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBinarySearch() {
    int value = 345;

    int actual = intArraySearchService.binarySearch(intArray, value);
  }

  @Test
  public void testFindAllPrime() {
    int[] array = {7};
    IntArray expected = new IntArray(array);

    IntArray actual = intArraySearchService.findAllPrime(intArray);
    assertEquals(actual, expected);
  }

  @Test
  public void testFindAllFibonacci() {
    int[] array = {8};
    IntArray expected = new IntArray(array);

    IntArray actual = intArraySearchService.findAllFibonacci(intArray);
    assertEquals(actual, expected);
  }

  @Test
  public void testFindAllWithUniqueDigits() {
    int[] array = {234, 54, 235, 65, 768, 236, 345, 7, 8};
    IntArray expected = new IntArray(array);

    IntArray actual = intArraySearchService.findAllWithUniqueDigits(intArray);
    assertEquals(actual,expected);
  }

  @Test
  public void testFindMax() {
    int expected = 4548;

    int actual = intArraySearchService.findMax(intArray);

    assertEquals(actual, expected);
  }

  @Test
  public void testFindMin() {
    int expected = 7;

    int actual = intArraySearchService.findMin(intArray);

    assertEquals(actual, expected);
  }

}
