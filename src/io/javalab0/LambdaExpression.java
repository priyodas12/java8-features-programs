package io.javalab0;

import java.util.Arrays;
import java.util.List;
// lambda expression is an anonymous function
// However, if a lambda has one statement and that statement is a return statement (and it returns an expression),
// the compiler can deduce the return type from the type of that one returned expression.

public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(9,2,3,8,5,6,7);

        numbers.forEach(integer -> System.out.print(integer));

        numbers.forEach(System.out::print);

        numbers.stream().forEachOrdered(integer -> System.out.println(integer));

        numbers.stream().forEach(integer -> System.out.println(integer));
    }
}
