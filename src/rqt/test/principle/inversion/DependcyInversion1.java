package rqt.test.principle.inversion;

/**
 * @author sky
 *
 * 设计模式原则-依赖倒置原则
 */
public class DependcyInversion1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

    static class Email{
        public String getInfo(){
            return "电子邮件信息：Hello,world!";
        }
    }
    //扩展性不好
    static class Person{
        public  void receive(Email email){
            System.out.println(email.getInfo());
        }
    }
}
