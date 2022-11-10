package io.javalab1.optional;

import java.util.Optional;
import java.util.stream.IntStream;

public class OptionalImpl2 {
    public static void main(String[] args) {
        Optional<Object> optional=Optional.empty();

        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());

        Optional<String> optional2=Optional.of("Hello");

        System.out.println(optional2.isPresent());
        System.out.println(optional2.isEmpty());

        optional2.orElse("default value");

        Integer [] atrArray={10,null};
        IntStream.range(0,2).forEach(
                x->{
                    Optional<Integer> val=Optional.ofNullable(atrArray[x]);
                    System.out.println(val.map(i->i*i).orElse(0));
                }
        );


    }
}
