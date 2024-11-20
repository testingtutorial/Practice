public class LoopConcept {

    public static void getTables()
    {
        System.out.println(2*1);
        System.out.println(2*2);
        System.out.println(2*3);
        System.out.println(2*4);
        System.out.println(2*5);
        System.out.println(2*6);
        System.out.println(2*7);
        System.out.println(2*8);
        System.out.println(2*9);
        System.out.println(2*10);

    }

    public static void doActions()
    {
        int i=10;
        while (i>0)
        {
            System.out.println(2*i);
            i--;
        }

        System.out.println("Outside of the while loop");

    }

    public static void main(String[] args) {

        //getTables();
        doActions();

    }
}
