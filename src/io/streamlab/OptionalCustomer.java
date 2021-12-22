package io.streamlab;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalCustomer {
    public static void main(String[] args) {
        List<String> names=CustomerManagerImpl.getCustomerList().stream().map(Customer::getName).collect(Collectors.toList());
        System.out.println(names);
        names.stream().forEach(name-> {
                    Optional<String> validName = Optional.ofNullable(name);
                    System.out.println(validName.orElse("NO NAME FOUND"));
                });
        CustomerManagerImpl.getCustomerList().forEach(customer->
                System.out.println(Optional.ofNullable(customer.getEmail()).isPresent()?customer.getEmail():"NO EMAIL FOUND"));
    }
}
