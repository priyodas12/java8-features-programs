package io.javalab1.optional;

import java.util.Optional;
/*
* It is a public final class and used to deal with NullPointerException in Java application.
* You must import java.util package to use this class.
* It provides methods which are used to check the presence of value for particular variable
*/

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
