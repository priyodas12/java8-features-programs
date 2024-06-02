/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 02/06/24, 8:47 pm
 *  Project: java8-features-programs
 */

package io.java8.features.interfaceMethods;

public interface DefaultMethodInterface {

  default void implementedMethod() {
    System.out.println("inside Interface");
  }
}
