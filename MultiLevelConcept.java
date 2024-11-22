class A
{
    public void method1()
    {
        System.out.println("Method1");
    }
}

class B extends A
{

    public void method2()
    {
        System.out.println("Method2");
    }
}

class C extends B
{
    public void method3()
    {
        System.out.println("Method3");
    }
}


public class MultiLevelConcept {
    public static void main(String[] args) {

        C c = new C();
        c.method3();
        c.method2();
        c.method1();
    }
}
