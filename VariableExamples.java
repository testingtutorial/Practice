public class VariableExamples {

    static String name = "Popal";
    int age = 40;

    public void getStudentDetails()
    {
        String name = "Nazeer";
        System.out.println(name);
        System.out.println(VariableExamples.name);
    }

    public static void main(String[] args) {

        VariableExamples ve = new VariableExamples();

        System.out.println(ve.name);
        System.out.println(ve.age);
        ve.getStudentDetails();
    }

}
