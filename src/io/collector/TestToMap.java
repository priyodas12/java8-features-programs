package io.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class TestToMap {
    public static void main(String[] args) {
        List<Number> numbers= Arrays.asList(1,4,2,8,4,5,8,5,9);
        Function<Number,Integer> f=(t)->{
            return t.intValue();
        };
        Map<Number,Long> framedNumber=numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(framedNumber);
    }
}
