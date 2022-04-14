package rqt.test.principle.compositereuse;

/**
 * 合成复用原则
 * 尽量使用合成、聚合的方式，不要使用继承
 */
public class CompositeReuse1 {

    public static void main(String[] args) {
        //这种实现方式违反了合成复用原则
        B b = new B();
        b.fun1();
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
//定义一个类B,B要使用A中的fun1方法,通过继承来调用
class B extends A{

}
