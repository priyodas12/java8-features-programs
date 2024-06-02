/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 02/06/24, 8:47 pm
 *  Project: java8-features-programs
 */

package io.java8.features.interfaceMethods;

public class DefaultMethodClass implements DefaultMethodInterface {

  public static void main(String[] args) {
    DefaultMethodInterface defaultMethodInterface = new DefaultMethodClass();
    defaultMethodInterface.implementedMethod();
  }

  public void implementedMethod() {
    System.out.println("inside class");
  }
}
