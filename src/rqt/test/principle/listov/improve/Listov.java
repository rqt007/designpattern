package rqt.test.principle.listov.improve;

/**
 * 里氏替换原则
 * 1.尽量不要重写父类的方法
 * 2.通常的做法是父类和子类继承一个更通俗的基类，原有的继承关系去掉，采用依赖、组合，聚合等关系替代
 */
public class Listov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-1="+a.fun1(11,1));
        System.out.println("1-8="+a.fun1(1,8));
        B b = new B();
        System.out.println("11+1="+b.fun1(11,1));
        System.out.println("1+8="+b.fun1(1,8));
        System.out.println("11+8+8="+b.fun2(11,8));
        System.out.println("11-8="+b.fun3(11, 8));

    }



}
//定义一个基类
class Base{

}

class A extends Base{
    public int fun1(int a,int b){
        return a-b;
    }
}

class B extends Base{
    private A a = new A();

    //B重写了父类fun1方法
    public int fun1(int a,int b){
        return a+b;
    }

    public int fun2(int a,int b){
        return fun1(a,b) +b;
    }

    //调用A类中的fun1方法
    public int fun3(int a,int b){
        return this.a.fun1(a, b);
    }
}