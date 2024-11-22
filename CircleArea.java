class Area
{
    int area;
    public void getArea()
    {
        System.out.println("Calculating Area");
    }
}

public class CircleArea extends Area{

    public static void main(String[] args) {

        CircleArea ca = new CircleArea();
        Area pc = new Area();
        pc.getArea();
        ca.getArea();
        Area ar = new CircleArea();
        ar.getArea();


    }
}

class RectangleArea extends Area
{
    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea();
        ra.getArea();
    }
}

class SquareArea extends Area
{
    public static void main(String[] args) {

        SquareArea sa = new SquareArea();
        sa.getArea();
    }
}
