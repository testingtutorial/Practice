import java.io.File;

public class EncapsulationAccess{

    public static void main (String[] args){

        DataEncapsulation obj = new DataEncapsulation();

        System.out.println(obj.getEmpSal());
        obj.setEmpSal(20000);
        System.out.println(obj.getEmpSal());
        System.out.println(obj.getCourse());

    }

}
