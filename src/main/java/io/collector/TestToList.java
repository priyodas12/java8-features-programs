package io.collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestToList {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toUnmodifiableList());
        System.out.println(numbers);
        System.out.println(numbers.getClass());//class java.util.ImmutableCollections$ListN
        //numbers.add(11);
        System.out.println(numbers);
    }
}
