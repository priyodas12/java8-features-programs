/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 02/06/24, 8:48 pm
 *  Project: java8-features-programs
 */

package io.java8.features.functionalInterface;

import java.util.function.Predicate;

public class PredicateImpl {

  public static void main(String[] args) {
    Predicate<Integer> p1 = (i) -> {
      return i > 10;
    };

    Predicate<Integer> p2 = (i) -> {
      return i % 2 == 0;
    };

    Predicate<String> p3 = (s) -> {
      return s.length() > 5;
    };

    Predicate<String> p4 = Predicate.isEqual("Priyo");

    System.out.println(p1.test(10));
    System.out.println(p3.test("abcdfdf"));

    //checks the opposite condition of predicate
    System.out.println(p1.negate().test(100));

    //checks both predicate condition and AND result of both predicate
    System.out.println(p1.and(p2).test(9));

    //checks both predicate condition and OR result of both predicate
    System.out.println(p1.or(p2).test(11));

    System.out.println(p4.test("Priyo"));


  }
}
