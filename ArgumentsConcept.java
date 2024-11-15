public class ArgumentsConcept {


    public void addition(int a, int b, int c)
    {
        int total= a+b+c;
        System.out.println(total);
    }

    public double multiplication(double a, double b)
    {
        //double multiply= a*b;
        return a*b;
    }

    public void getCircleArea(double radius)
    {
        //double radius = 1.5;
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }

    public void division()
    {

    }

    public static void main(String[] args) {

        ArgumentsConcept arc = new ArgumentsConcept();
        arc.addition(5,6,7);
        double values = arc.multiplication(5.5,10.5);
        System.out.println(values);
        arc.getCircleArea(4.0);

    }
}
