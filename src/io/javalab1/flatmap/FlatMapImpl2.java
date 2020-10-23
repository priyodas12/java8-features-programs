package io.javalab1.flatmap;

import java.util.stream.Stream;

public class FlatMapImpl2 {

    public static void main(String[] args) {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("abc", "bca",
                "def", "dfg");

        // Using forEachOrdered(Consumer action)
        stream.flatMap(str-> Stream.of(str.charAt(2)))
                .forEachOrdered(System.out::println);
    }
}
