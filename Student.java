public class Student {


    public void add(int a, int b)
    {
        int total = a+b;
        System.out.println("Inside add method "+total);
        addition(10,20);

    }

    public void addition(int c, int d)
    {
        int tot = c+d;
        System.out.print("Inside addition method "+tot);
    }


    public static void main(String []args)
    {
        Student stu = new Student();
        stu.add(2,3);
    }
}
