/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 01/06/24, 10:54 pm
 *  Project: java8-features-programs
 */

/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 01/06/24, 10:42 pm
 *  Project: java8-features-programs
 */

package io.java8.features.functionalInterface;

import org.apache.commons.lang3.ThreadUtils;

/**
 * On compilation, for each anonymous class, a separate class file gets generated. The format of the
 * class file is the class name followed by a dollar sign and a number. For instance, if we define
 * an anonymous class in a class named TestClass, then after compilation, an additional file
 * TestClass$1.class will be created.
 * <p>
 * On the other hand, in the case of a lambda expression, an invokedynamic instruction is added to
 * the class file. This opcode instruction helps to figure out the functional interface method to be
 * called.
 */

public class LambdaVsAnnonymousInnerClass {

  public static void main(String[] args) {
    Runnable r1 = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println(
              String.format("threadName : %s count: %d", Thread.currentThread().getName(), i));
        }
      }
    };

    r1.run();

    Thread t1 = new Thread(
        () -> System.out.println(String.format("%s, %s", Thread.currentThread().getName(),
            ThreadUtils.getAllThreads())));

    t1.start();

  }
}
