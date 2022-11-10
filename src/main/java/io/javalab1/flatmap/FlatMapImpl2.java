package io.javalab1.flatmap;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapImpl2 {

    public static void main(String[] args) {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("abc", "bca", "def", "dfg");

        // Using forEachOrdered(Consumer action)
        //stream.flatMap(str-> Stream.of(str.charAt(2))).forEachOrdered(System.out::println);
        Arrays.asList("fabcd", "gbcah", "defk", "dfgs").stream().flatMap(x->x.lines()).sorted().forEach(System.out::println);
        Arrays.asList("abcd", "bcah", "defk", "dfgs").stream().flatMapToInt(x->x.chars()).forEach(x-> System.out.println((char)x));
    }
}
