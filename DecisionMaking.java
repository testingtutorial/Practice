public class DecisionMaking {

    public void evaluateAge(int age, String name)
    {

        if(age > 18)//if(true)
        {
            System.out.println("You are eligible to vote");
        }else
        {
            System.out.println("You are not eligible to vote");
        }

        if(name.equals("Popal"))
        {
            System.out.println("How are you today");
        }
        else if (name.equals("Amrapali")) {

            System.out.println("How are you doing today");
    } else if (name.equals("Driss")) {

            System.out.println("Do you have any doubts today");

        }
        else
        {
            System.out.println("Who is missing today");
        }
    }

    public void checkTransaction(String country, String state)
    {
        if(country.equals("USA"))
        {
            if(state.equals("LA"))
            {
                System.out.println("You are authorized to make this transaction");
            }else
            {
                System.out.println("You are not authorized to make this transaction");
            }
        }
        else
        {
            System.out.println("You are not in the correct place");
        }
    }


    public static void main(String[] args) {

        DecisionMaking dm = new DecisionMaking();
        dm.evaluateAge(19, "xyz");
        dm.checkTransaction("Belgium", "AL");

    }
}
