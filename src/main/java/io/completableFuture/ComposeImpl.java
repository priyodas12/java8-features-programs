package io.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/*Combining dependent future*/
public class ComposeImpl {

    private static void delay(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static CompletableFuture<String> selectProduct(){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("Product selection by "+Thread.currentThread().getName());
            delay(2);
            return "Product:xyz";
        });
    }

    private static CompletableFuture<String> payment(String product){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("Payment process done for "+Thread.currentThread().getName()+" >>  "+product);
            delay(3);
            return "Payment received for "+product;
        });
    }

    private static CompletableFuture<String> notifyUser(String product){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("Email notification sent by "+Thread.currentThread().getName());
            delay(2);
            return "Notification Email triggered after "+product;
        });
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime=System.currentTimeMillis();
        CompletableFuture<String> future=
                selectProduct()
                .thenCompose((user)->payment(user))
                .thenCompose((user)->notifyUser(user));

        System.out.println("Doing something in main");
        delay(4);
        System.out.println(future.join());
        //System.out.println(future.get());
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000);
    }
}
