class ParentClass1 {

    public static int a = 100;
    public int b = 200;
}

class ChildClass1 extends ParentClass1{

    public static int a = 10;
    public int b = 20;
}

class ChildClass2 extends ChildClass1 {

    public static int a = 1;
    public int b = 2;

    public void method() {

        System.out.println(a);
        System.out.println(ChildClass1.a);
        System.out.println(ParentClass1.a);

        System.out.println(b);
        System.out.println(super.b);
        ParentClass1 obj = new ChildClass2();
        System.out.println(obj.b);
    }
}

public class Concept2 extends ChildClass2{

    public static void main(String[] args) {

        Concept2 co = new Concept2();
        co.method();
    }
}
