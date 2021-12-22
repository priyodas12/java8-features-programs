package io.functional;

public class ProductRepoImpl {

    public static void main(String[] args) {
        ProductRepo productRepo=()->true;
        System.out.println(productRepo.checkConnection());
    }
}
