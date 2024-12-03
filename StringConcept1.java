public class StringConcept1 {

    public static void main(String[] args) {

        String name = "Testing";

        System.out.println(name);
        name.concat("Course");
        System.out.println(name);

        System.out.println("-----------------------");

        StringBuffer name2 = new StringBuffer("Testing");

        System.out.println(name2);
        name2.append("course");
        System.out.println(name2);
    }
}
