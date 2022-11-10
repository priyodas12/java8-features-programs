package io.collector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollector {
    public static void main(String[] args)
    {
        // creating a stream of strings
        Stream<Number> s = Stream.of(1,2,3,4,5);

        // using Collectors counting() method to
        // count the number of input elements
        long ans = s.collect(Collectors.counting());

        // displaying the required count
        System.out.println(ans);
    }
}
