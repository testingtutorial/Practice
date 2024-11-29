class NewArea
{
    public void getArea(double radius)
    {
        System.out.println("Calculating circle area");
        System.out.println(3.14*radius*radius);
    }

    public void getArea(int side)
    {
        System.out.println("Calculating square area");
        System.out.println(side*side);

    }

    public void getArea(int length, int breadth)
    {
        System.out.println("Calculating rectangle area");
        System.out.println(length*breadth);
    }

    public void getArea(double base, int height)
    {
        System.out.println("Calculating triangle area");
        System.out.println(.5*base*height);
    }
}



public class OverloadingConcept1 extends NewArea{

    public static void main(String[] args) {

        OverloadingConcept1 ov = new OverloadingConcept1();
        ov.getArea(3.5);
        ov.getArea(5);
        ov.getArea(5,6);
        ov.getArea(2.5,4);
    }
}
