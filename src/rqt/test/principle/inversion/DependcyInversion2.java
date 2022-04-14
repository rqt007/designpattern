package rqt.test.principle.inversion;

/**
 * @author sky
 *
 * 设计模式原则-依赖倒置原则
 * DependcyInversion1的改进版本
 *
 */
public class DependcyInversion2 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }


    //定义一个接口
    interface IReceive{
        String getInfo();
    }

    static class Email implements IReceive{
        public String getInfo(){
            return "电子邮件信息：Hello,world!";
        }
    }

    static class Weixin implements IReceive{
        public String getInfo(){
            return "微信信息：Hello,world!";
        }
    }

    static class Person{
        //依赖接口,而不依赖具体的类
        public  void receive(IReceive receive){
            System.out.println(receive.getInfo());
        }
    }
}
