package io.java8.features.functionalInterface;

import java.util.Arrays;
import java.util.List;

/**
 * lambda expression is an anonymous function However, if a lambda has one statement and that
 * statement is a return statement (and it returns an expression), the compiler can deduce the
 * return type from the type of that one returned expression.
 */
public class LambdaExpression {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(9, 1, 3, 8, 5, 6, 7);

    numbers.forEach(integer -> System.out.print(integer));

    numbers.forEach(System.out::print);

    numbers.stream().forEachOrdered(integer -> System.out.println(integer));

    numbers.stream().forEach(integer -> System.out.println(integer));

    System.out.println(numbers.stream().map(integer -> integer * 3).reduce(0, (a, b) -> a + b));
  }
}
