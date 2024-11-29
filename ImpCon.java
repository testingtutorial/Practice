public class ImpCon extends Con1{

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

        ImpCon ic = new ImpCon();
        //Con1 con = new Con1();
        ic.m1();
        ic.m2();
        ic.m3();
    }
}
