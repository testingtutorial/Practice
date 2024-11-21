public class ConstructorConcept {


    public ConstructorConcept()
    {
        System.out.println("Constructor");
    }

    public ConstructorConcept(String name)
    {
        System.out.println("Parameterized "+name);
        System.out.println("Adding two numbers");
    }

    public ConstructorConcept(String name, int age, int salary)
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

    public static void getAddition(int a, int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        ConstructorConcept cc = new ConstructorConcept();
        //ConstructorConcept cc1 = new ConstructorConcept("Constructor");
        //ConstructorConcept cc2 = new ConstructorConcept("Testing", 20, 10000);
        getAddition(5,6);

    }
}
