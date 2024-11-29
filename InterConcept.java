public class InterConcept implements Interface1, Interface2{

    public void m1()
    {
        System.out.println("m1");
    }

    public void m2()
    {
        System.out.println("m2");
    }

    public void m3()
    {
        System.out.println("m3");
    }

    public void m4()
    {
        System.out.println("m4");
    }

    public void m5()
    {
        System.out.println("m5");
    }

    public static void main(String[] args) {
        Interface1 inter1 = new InterConcept();
        inter1.m1();
        inter1.m2();
        inter1.m3();
        Interface2 inter2 = new InterConcept();
        inter2.m4();
    }
}
