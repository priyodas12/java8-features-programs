package io.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplyAsyncImpl {

    private static void delay(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        Supplier<String> supplier = () -> {
            delay(1);
            return "Task-1 executed by " + Thread.currentThread().getName();
        };

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier, executorService);

        System.out.println("Main Task executed by thread : " + Thread.currentThread().getName());

        String returnValue=completableFuture.join();

        System.out.println(returnValue);

        //completableFuture.complete(returnValue);

        executorService.shutdownNow();
    }
}