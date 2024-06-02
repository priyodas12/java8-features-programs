/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 02/06/24, 8:49 pm
 *  Project: java8-features-programs
 */

package io.java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerManagerImpl {

  public static List<Customer> getCustomerList() {
    List<Number> phoneNumbers1 = Arrays.asList(129190291, 120192112);
    List<Number> phoneNumbers2 = Arrays.asList(849380223, 239823002);
    List<Number> phoneNumbers3 = Arrays.asList(449380223, 939823002);
    List<Number> phoneNumbers4 = Arrays.asList(649380223, 339823002);
    Customer c1 = new Customer(101, "abc", "abc@gmail.com", phoneNumbers1);
    Customer c2 = new Customer(102, "bac", null, phoneNumbers2);
    Customer c3 = new Customer(103, null, "tacf@gmail.com", phoneNumbers3);
    Customer c4 = new Customer(104, "asj", "tacf@gmail.com", phoneNumbers4);
    List<Customer> customerList = Arrays.asList(c1, c2, c3, c4);
    return customerList;
  }

  public static void main(String[] args) {
    List<Number> numberList = getCustomerList().stream()
        .flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
    System.out.println(numberList);
  }
}
