package io.completableFuture;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CallbackImpl {

    private static void delay(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CompletableFuture<Void> completableFuture=CompletableFuture.supplyAsync(
                ()->{
                    delay(2);
                    return ""+new Date();
                }
        )
                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println);

        completableFuture.join();
    }
}
