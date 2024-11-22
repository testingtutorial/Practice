class ParentClass {

    public static void method1() {

        System.out.println("method1");

    }

    public void method2() {

        System.out.println("method2");
    }

}

class ChildClass extends ParentClass
{
    public static void main (String[] args){

        method1();

        ChildClass obj = new ChildClass();
        obj.method2();

    }
}
