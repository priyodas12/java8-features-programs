package io.javalab2;

public class DefaultMethodClass  implements  DefaultMethodInterface{

    public void implementedMethod() {
        System.out.println("inside class");
    }

    public static void main(String[] args) {
        DefaultMethodInterface defaultMethodInterface=new DefaultMethodClass();
        defaultMethodInterface.implementedMethod();
    }
}
