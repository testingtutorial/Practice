public class ArrayConcept {


    public static void main(String[] args) {

        int [] numbers = new int[10];
        int [] newnumbers = {11,22,33,44,55,66,77,88,99};
        char [] characters =  {'a','b','c','d','e','f'};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        int len = numbers.length;
        int len1 = newnumbers.length;

        for(int i=0;i<len;i++)
        {
           System.out.println(numbers[i]);
        }

        for(int j=0;j<len1;j++)
        {
            System.out.print(newnumbers[j]+" ");
        }

    }
}
