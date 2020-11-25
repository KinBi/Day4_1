package com.monkeybusiness.training.task.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IntArrayDataReader {
  private static final Logger logger = LogManager.getLogger();

  public int[] readFromConsole() {
    Scanner scanner = new Scanner(System.in);

    int size = scanner.nextInt();
    int[] intArray = new int[size];

    int i = 0;

    while (i < size){
      int value = scanner.nextInt();
      intArray[i] = value;
      i++;
    }

    return intArray;
  }

  public int[] readFromFile(String fileName, int size){
    File file = new File(fileName);
    Scanner fileScanner = null;
    try {
      fileScanner = new Scanner(file);
    } catch (FileNotFoundException e) {
      logger.error("Exception was caused " + e);
      size = 0;
    }

    int[] intArray = new int[size];

    int i = 0;
    while (fileScanner.hasNextInt() && i < size){
      intArray[i] = fileScanner.nextInt();
      i++;
    }

    fileScanner.close();
    return intArray;
  }
}
