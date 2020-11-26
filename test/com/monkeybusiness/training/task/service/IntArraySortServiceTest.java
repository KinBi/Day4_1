package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.IntArray;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class IntArraySortServiceTest {
  IntArraySortService intArraySortService;
  IntArray intArray;
  IntArray sortedIntArray;

  @BeforeMethod
  public void setUp() {
    intArraySortService = new IntArraySortService();
    int[] array = {234, 54, 235, 65, 768, 236, 4548, 345, 7, 8};
    int[] sortedArray = Arrays.copyOf(array, array.length);
    Arrays.sort(sortedArray);
    intArray = new IntArray(array);
    sortedIntArray = new IntArray(sortedArray);
  }

  @Test(enabled = false)
  public void testMonkeySort() {
    IntArray expected = sortedIntArray;

    intArraySortService.monkeySort(intArray);
    IntArray actual = intArray;

    assertEquals(actual, expected);
  }

  @Test
  public void testGnomeSort() {
    IntArray expected = sortedIntArray;

    intArraySortService.gnomeSort(intArray);
    IntArray actual = intArray;

    assertEquals(actual, expected);
  }

  @Test
  public void testBubbleSort() {
    IntArray expected = sortedIntArray;

    intArraySortService.bubbleSort(intArray);
    IntArray actual = intArray;

    assertEquals(actual, expected);
  }
}