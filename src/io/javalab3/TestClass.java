package io.javalab3;

public class TestClass {
    public static void main(String[] args) {
        A a0=new A();
        B b0=new B();
        A a1=new B();

        a0.m1();
        b0.m1();
        a1.m1();

    }
}
class A{
    void m1(){
        System.out.println("A");
    }
}

class B extends A{
    void m1(){
        System.out.println("B");
    }
}