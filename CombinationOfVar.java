public class CombinationOfVar {
    public static int a = 100;
    public int b = 200;

    public void method() {
        int a = 10;
        //int b = 20;
        System.out.println(CombinationOfVar.a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        CombinationOfVar cov = new CombinationOfVar();
        cov.method();
    }
}
