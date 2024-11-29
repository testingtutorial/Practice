class NewArea1
{

    public double getArea(int radius)
    {
        //System.out.println(3.14*radius*radius);
        System.out.println("Calculating circle area");
        System.out.println("Parent Class");
        System.out.println();
        return 3.14*radius*radius;
    }

    public void getDetails()
    {
        System.out.println("Getting Details");
    }
}


public class OverridingConcept1 extends NewArea1{

    public double getArea(int radius)
    {
        System.out.println(3.14*radius*radius);
        System.out.println("Calculating circle area");
        System.out.println("This is the child class");
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {

//        OverridingConcept1 oc = new OverridingConcept1();
//        double area = oc.getArea(4);
//        System.out.println(area);
//        NewArea1 nw = new NewArea1();
//        nw.getArea(5);
        NewArea1 nwc = new OverridingConcept1();
        nwc.getArea(6);
//        nwc.getDetails();
    }
}
