package io.javalab.optional;

import java.util.Optional;

public class OptionalImpl {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[5]="abc";

        //if there is possibility of null object to be assigned;
        Optional<String> checkNull = Optional.ofNullable(words[5]);

        //check is there is non null value;
        System.out.println(checkNull.isPresent()?""+checkNull.get():"word was null");
    }
}
