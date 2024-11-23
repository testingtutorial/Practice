class ConstructorCon
{
    public ConstructorCon()
    {
        System.out.println("Parent class constructor");
    }
}

public class Concept3 extends ConstructorCon{

    public Concept3(int b)
    {
        super();
        System.out.println(b);
    }
    public static void main(String[] args) {

        Concept3 co = new Concept3(10);
    }
}
