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

  @BeforeMethod
  public void setUp() {
    intArraySortService = new IntArraySortService();
    int[] array = {234, 54, 235, 65, 768, 236, 4548, 345, 7, 8};
    intArray = new IntArray(array);
  }

  @Test(enabled = false)
  public void testMonkeySort() {
    int[] array = intArray.getValues();
    Arrays.sort(array);

    IntArray expected = new IntArray(array);

    IntArray intArray1 = new IntArray(intArray.getValues());
    intArraySortService.monkeySort(intArray1);
    IntArray actual = intArray1;

    assertEquals(actual, expected);
  }

  @Test
  public void testGnomeSort() {
    int[] array = intArray.getValues();
    Arrays.sort(array);

    IntArray expected = new IntArray(array);

    IntArray intArray1 = new IntArray(intArray.getValues());
    intArraySortService.gnomeSort(intArray1);
    IntArray actual = intArray1;

    assertEquals(actual, expected);
  }

  @Test
  public void testBubbleSort() {
    int[] array = intArray.getValues();
    Arrays.sort(array);

    IntArray expected = new IntArray(array);

    IntArray intArray1 = new IntArray(intArray.getValues());
    intArraySortService.bubbleSort(intArray1);
    IntArray actual = intArray1;

    assertEquals(actual, expected);
  }
}