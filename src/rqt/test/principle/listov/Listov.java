package rqt.test.principle.listov;

/**
 * 里氏替换原则
 *
 */
public class Listov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-1="+a.fun1(11,1));
        System.out.println("1-8="+a.fun1(1,8));
        B b = new B();
        System.out.println("11-1="+b.fun1(11,1));
        System.out.println("1-8="+b.fun1(1,8));
        System.out.println("11-8+8="+b.fun2(11,8));

    }


}
class A{
    public int fun1(int a,int b){
        return a-b;
    }
}
class B extends A{
    //B重写了父类fun1方法
    public int fun1(int a,int b){
        return a+b;
    }

    public int fun2(int a,int b){
        return fun1(a,b) +b;
    }
}