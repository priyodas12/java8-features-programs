package io.collector;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestToMap2 {
    public static void main(String[] args) {
        List<String> listWithDuplicates = Arrays.asList("a", "bb", "cc", "dd", "bb","cc","dd","cc");
        System.out.println(listWithDuplicates.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}
