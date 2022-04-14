package rqt.test.principle.compositereuse.improve;

import java.io.File;
import java.io.FileInputStream;

/**
 * 合成复用原则
 * 尽量使用合成、聚合的方式，不要使用继承
 */
public class CompositeReuse2 {

    public static void main(String[] args) {
        //这种实现方式符合合成复用原则
        B b = new B();
        b.getA().fun1();
    }
}

class A{
    public void fun1(){
        System.out.println("方法1");
    }

    public void fun2(){
        System.out.println("方法2");
    }
}

//定义一个类B,B要使用A中的fun1方法,通过成员变量实现
class B  {
 private A a = new A();

    public A getA() {
        return a;
    }

}
