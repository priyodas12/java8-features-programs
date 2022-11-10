package io.javalab2;

public interface DefaultMethodInterface {
    default void implementedMethod(){
        System.out.println("inside Interface");
    }
}
