public class ConsConcept {

    int a;
    float b;
    char c;
    double d;
    boolean bd;
    String st;

    public ConsConcept(int ab, float b, char c, double d, boolean bd, String st)
    {
        this.a = ab;
        this.b = b;
        this.c = c;
        this.d = d;
        this.bd = bd;
        this.st = st;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(this.b);
        System.out.println(c);
        System.out.println(this.c);
        System.out.println(d);
        System.out.println(this.d);
        System.out.println(bd);
        System.out.println(this.bd);
        System.out.println(st);
        System.out.println(this.st);

    }

    public static void main(String[] args) {

        ConsConcept cc = new ConsConcept(10, 5, 'a',10,true, "Test");
    }
}
