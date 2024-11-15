public class CallingNonStaticInStatic {

    public void method1() {
        System.out.println("It is a non static method");

    }
    public static void method2() {
        CallingNonStaticInStatic   Object2  =  new CallingNonStaticInStatic();
        Object2.method1();
    }
    public static void main(String[] args) {
        method2();
    }  }

