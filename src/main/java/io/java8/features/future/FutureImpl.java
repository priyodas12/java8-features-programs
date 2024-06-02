/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 02/06/24, 8:48 pm
 *  Project: java8-features-programs
 */

package io.java8.features.future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FutureImpl implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    TimeUnit.MILLISECONDS.sleep(3000);
    System.out.println(Thread.currentThread().getName());
    return new Random().nextInt();
  }
}
