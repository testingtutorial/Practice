public class StringConcept {

    public static void main(String[] args) {

        String name = "Testing"; // 1st way of declaring a String
        String name1 = new String("Testing");
        String name2 = "Testing";

        System.out.println(name==name2);
        System.out.println(name==name1);
        System.out.println(name.equals(name1));

        System.out.println(name.toUpperCase());

        int len = name.length();
        System.out.println(len);

        for(int i=0;i<len;i++)
        {
            System.out.println(name.charAt(i));
        }



    }
}
