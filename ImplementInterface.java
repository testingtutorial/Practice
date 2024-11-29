public class ImplementInterface implements InterfaceConcept{

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

    public static void main(String[] args) {

        InterfaceConcept ii = new ImplementInterface();
        ii.m1();
        ii.m2();
        ii.m3();

    }
}
