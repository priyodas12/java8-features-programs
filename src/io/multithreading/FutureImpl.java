package io.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FutureImpl implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        TimeUnit.MILLISECONDS.sleep(3000);
        System.out.println(Thread.currentThread().getName());
        return new Random().nextInt();
    }
}
