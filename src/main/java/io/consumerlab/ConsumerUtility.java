package io.consumerlab;

import java.util.function.Consumer;

/*
    @FunctionalInterface
    public interface Consumer<T>
    Represents an operation that accepts a single input argument and returns no result.
    Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
    This is a functional interface whose functional method is accept(Object).
*/

public class ConsumerUtility {
    public static void main(String[] args) {
        Consumer<String> printElement=s-> System.out.println(s);

        printElement.accept("Priyobrato");
    }
}
