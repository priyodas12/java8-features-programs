package io.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestToSet {
    public static void main(String[] args) {
        List<Number> numbers= Arrays.asList(1,4,2,8,4,5,8,5,9);
        System.out.println(numbers);
        Set<Number> uniqueNumbers=numbers.stream().collect(Collectors.toSet()); // or new HashSet<>(numbers)
        System.out.println(uniqueNumbers);
    }
}
