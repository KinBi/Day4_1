package com.monkeybusiness.training.task.entity;

import java.util.Arrays;

public class IntArray {
  public final int DEFAULT_SIZE = 0;
  private int[] values;

  public IntArray() {
    this.values = new int[DEFAULT_SIZE];
  }

  public IntArray(int[] value) {
    this.values = value;
  }

  public IntArray(int size) {
    this.values = new int[size];
  }

  private void grow() {
    int size = values.length + 1;
    values = Arrays.copyOf(values, size);
  }

  public int get(int index) {
    return values[index];
  }

  public void set(int index, int value) {
    values[index] = value;
  }

  public void add(int value) {
    grow();
    int lastIndex = values.length - 1;
    values[lastIndex] = value;
  }

  public int size() {
    return values.length;
  }

  public void setValues(int[] values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    IntArray intArray = (IntArray) o;

    if (DEFAULT_SIZE != intArray.DEFAULT_SIZE) return false;
    return Arrays.equals(values, intArray.values);
  }

  @Override
  public int hashCode() {
    int result = DEFAULT_SIZE;
    result = 31 * result + Arrays.hashCode(values);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("IntArray{");
    sb.append("value=").append(Arrays.toString(values));
    sb.append('}');
    return sb.toString();
  }
}
