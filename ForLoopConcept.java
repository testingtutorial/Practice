public class ForLoopConcept {

    public static void getTables()
    {
        int i;
        for(i=1;i<11;i++)
        {
            System.out.println(2*i);
            if(i==5)
                continue;
            System.out.println("Values");
        }
    }

    public static void getReverseTable()
    {
        for(int i=10;i>0;i--)
        {
            System.out.println(2*i);
            if(i==7)
            {
                break;
            }
        }
    }

    public static void main(String[] args) {

        getTables();
        getReverseTable();

    }
}
