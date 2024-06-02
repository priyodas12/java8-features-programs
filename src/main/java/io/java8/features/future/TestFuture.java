/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 02/06/24, 8:48 pm
 *  Project: java8-features-programs
 */

package io.java8.features.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class TestFuture {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(10);
    List<Future<Integer>> futureList = new ArrayList<>();
    IntStream.rangeClosed(0, 4).forEach(i -> {
          Future<Integer> integerFuture = executor.submit(new FutureImpl());
          futureList.add(integerFuture);
        }
    );
    futureList.forEach(i -> {
      Integer result = null;
      try {
        result = i.get();
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
      System.out.println(result + " printed by " + Thread.currentThread().getName());
    });

    executor.shutdown();
  }
}
