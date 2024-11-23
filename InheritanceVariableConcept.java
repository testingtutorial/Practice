class VariableConcept
{
    public static int a = 100;
    public int b = 200;
}

public class InheritanceVariableConcept extends VariableConcept {

    public static void main(String[] args) {

        System.out.println(a);

        InheritanceVariableConcept obj = new InheritanceVariableConcept();

        System.out.println( obj.b );
    }
}
