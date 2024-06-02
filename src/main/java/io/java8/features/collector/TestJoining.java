package io.java8.features.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestJoining {

  public static void main(String[] args) {
    List<Number> numbers = Arrays.asList(1, 4, 2, 8, 4, 5, 8, 5, 9);
    System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
    Map<Boolean, List<Number>> oddNEven = numbers.stream()
        .collect(Collectors.partitioningBy(number -> number.intValue() % 2 == 0));
    System.out.println(oddNEven);
  }
}
