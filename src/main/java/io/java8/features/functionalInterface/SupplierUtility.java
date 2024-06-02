/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 02/06/24, 8:50 pm
 *  Project: java8-features-programs
 */

package io.java8.features.functionalInterface;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierUtility {

  public static void main(String[] args) {
    Supplier<String> stringSupplier = () -> {
      String[] nameLake = {"A", "B", "C", "D", "E", "F"};
      int index = (int) (Math.random() * 5);
      return nameLake[index];
    };

    Supplier<String> otpSupplier = () -> {
      return String.valueOf((Math.random() * 10000000)).substring(0, 6);
    };

    IntStream.rangeClosed(0, 5).forEach(n -> System.out.println(stringSupplier.get()));

    IntStream.rangeClosed(0, 5).forEach(otp -> System.out.println(otpSupplier.get()));
  }
}

