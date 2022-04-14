package rqt.test.principle.inversion;

/**
 * @author sky
 * <p>
 * 设计模式原则-依赖倒置原则
 * 实现依赖传递的三种方式
 * 1.通过接口实现
 * 2.通过构造器实现
 * 3.通过setter方法实现
 */
public class DependcyInversion3 {

    public static void main(String[] args) {
        HuaWei huaWei = new HuaWei();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setItv(huaWei);
        openAndClose.open();
    }


    //方式1：通过接口传递实现依赖
    //开关的接口
   /* interface IOpenAndClose{
        //抽象方法，接受接口
        public  void open(ITV itv);
    }

    interface ITV{
        public void play();
    }

    //实现接口
    static class OpenAndClose implements IOpenAndClose{

        @Override
        public void open(ITV itv) {
            itv.play();
        }
    }*/

    //方式2:通过构造方法依赖传递
    /*interface IOpenAndClose{
        //抽象方法
        public  void open();
    }

    interface ITV{
        public void play();
    }

    //实现接口
    static class OpenAndClose implements IOpenAndClose{
        public ITV itv;

        public OpenAndClose(ITV itv){
            this.itv = itv;
        }
        @Override
        public void open() {
            this.itv.play();
        }
    }*/

    //方式3:通过setter方法依赖传递
    interface IOpenAndClose {
        //抽象方法
        void open();
    }

    interface ITV {
        void play();
    }

    //实现接口
    static class OpenAndClose implements IOpenAndClose {
        private ITV itv;

        public void setItv(ITV itv) {
            this.itv = itv;
        }

        @Override
        public void open() {
            this.itv.play();
        }
    }

    static class HuaWei implements ITV {

        @Override
        public void play() {
            System.out.println("华为电视机启动了");
        }
    }
}
