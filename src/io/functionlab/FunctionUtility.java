package io.functionlab;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
@FunctionalInterface
public interface Function<T,R>
Represents a function that accepts one argument and produces a result.
This is a functional interface whose functional method is apply(Object).
*/
public class FunctionUtility {
    public static void main(String[] args) {
        Function<String,Integer> testFunction=(String::length);

        Function<Integer,Integer[]> testFunctionArray=i -> IntStream.rangeClosed(0,i).boxed().toArray(Integer []::new);

        Function<String,String> identityImpl=Function.identity();

        System.out.println(identityImpl.apply("priyo"));

        System.out.println(Arrays.toString(testFunction.andThen(testFunctionArray).apply("priyo")));//testFunction-> testFunctionArray

        System.out.println(Arrays.toString(testFunctionArray.compose(testFunction).apply("priyo")));//testFunctionArray->testFunction
    }
}
