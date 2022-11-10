package io.supplierlab;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierUtility {
    public static void main(String[] args) {
        Supplier<String> stringSupplier=()->{
            String [] nameLake={"A","B","C","D","E","F"};
            int index=(int)(Math.random()*5);
            return nameLake[index];
        };

        Supplier<String> otpSupplier=()->{
            return String.valueOf((Math.random()*10000000)).substring(0,6);
        };

        IntStream.rangeClosed(0,5).forEach(n-> System.out.println(stringSupplier.get()));

        IntStream.rangeClosed(0,5).forEach(otp-> System.out.println(otpSupplier.get()));
    }
}

