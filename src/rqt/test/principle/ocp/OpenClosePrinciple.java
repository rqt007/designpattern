package rqt.test.principle.ocp;

/**
 * 开闭原则
 */
public class OpenClosePrinciple {
    public static void main(String[] args) {
        //使用时的优缺点
        //优点是比较好理解，简单易操作
        //缺点：违反了设计模式的开闭原则，即对扩展开放（提供方），对修改关闭（使用方），即给类新增功能时，尽量少改动代码或者不改代码
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//这是一个用于绘图的类
class GraphicEditor{

    public void drawShape(Shape shape){
        if(1==shape.type){
            drawRectangle(shape);
        }else if (2==shape.type){
            drawCircle(shape);
        }
    }

    public void drawRectangle(Shape shape){
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape shape){
        System.out.println("绘制圆形");
    }
}


class Shape{
    int type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.type =1;
    }
}

class Circle extends Shape{
    Circle(){
        super.type = 2;
    }
}