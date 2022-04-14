package rqt.test.principle.ocp.improve;

/**
 * 开闭原则
 */
public class OpenClosePrinciple1 {
    public static void main(String[] args) {
        //改进后的符合设计模式的开闭原则
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//这是一个用于绘图的类
class GraphicEditor {

    public void drawShape(Shape shape) {
      shape.draw();
    }

}


abstract class Shape {
    int type;

    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//扩展一个其他图形
class OtherGraphic extends Shape{
    OtherGraphic() {
        super.type = 0;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}