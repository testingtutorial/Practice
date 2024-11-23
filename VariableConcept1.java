class VariableCon
{
    public static int c = 100;
    public int d = 200;
}

public class VariableConcept1 extends VariableCon{

    public static int c = 10;
    public int d = 20;

    public void method(){

        System.out.println(c);
        System.out.println( VariableCon.c );

        System.out.println(d);
        System.out.println(super.d);

    }
    public static void main(String[] args) {

        VariableConcept1 vc = new VariableConcept1();
        vc.method();

    }
}
