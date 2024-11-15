public class Area {


    public void getArea(int length, int breadth)
    {

        int area= length * breadth;
        System.out.println(area);
        addArea();
    }

    public static void addArea()
    {
        System.out.print("add");
    }

    public static void main(String[] args) {

        Area ar= new Area();
        ar.getArea(10,20);
    }
}
