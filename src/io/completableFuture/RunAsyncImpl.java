package io.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class RunAsyncImpl {

    private static void delay(int sec){
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(8);
        Runnable runnable=()->{
            IntStream.rangeClosed(0,9).forEach(i->{
                delay(1);
                System.out.println("Task-1 executed by "+i+" : "+Thread.currentThread().getName());
            });

            IntStream.rangeClosed(0,9).forEach(i->{
                delay(2);
                System.out.println("Task-2 executed by "+i+" : "+Thread.currentThread().getName());
            });
        };

        CompletableFuture<Void> completableFuture=CompletableFuture.runAsync(runnable,executorService);

        System.out.println("Main Task executed by thread : "+Thread.currentThread().getName());

        completableFuture.join();
    }
}
