public class SwitchConcept {

    public static void getCondition(int age)
    {
        switch(age){

            case 10:
                System.out.println("You can go ahead with your work");
                break;
            case 20:
                System.out.println("You can not go ahead with this");
                break;
            case 30:
                System.out.println("xyzzzzz");
                break;
            default:
                System.out.println("Not available");
        }

    }

    public static void main(String[] args) {

        getCondition(40);

    }
}
