package io.java8.features.completableFuture;

import java.util.Arrays;
import java.util.List;

public class ParallelProgram {

  public static void sleepTime(int seconds) {
    try {
      Thread.sleep(seconds * 1000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static int transform(int number) {
    sleepTime(1);
    System.out.println(Thread.currentThread().getName() + " taking charge for " + number);
    return number * 11;
  }

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(12, 2, 13, 4, 5, 6, 7, 8, 9, 10, 11);
    System.out.println("Processor: " + Runtime.getRuntime().availableProcessors());
    integerList.parallelStream()
        .map(number -> transform(number))
        .forEachOrdered(System.out::println);

  }
}
