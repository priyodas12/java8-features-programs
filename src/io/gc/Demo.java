package io.gc;

public class Demo {
    public static void main(String[] args) throws Exception {
        Demo d1=new Demo();
        Demo d2=new Demo();

        d1=null;

        System.gc();

        d2=null;

        Runtime.getRuntime().gc();

    }


    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
        //Thread.sleep(1000);
        //System.out.println("Garbage Collector Called...");
        System.out.println("Collected..."+ this);

    }
}
