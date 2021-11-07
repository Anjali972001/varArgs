public class construct4 {
    String name;
    int emp_id;
    construct4(String name , int emp_id)
    {
        this.name=name;
        this.emp_id=emp_id;
    }

    public static void main(String[] args)
    {
        construct4 cc= new construct4("anjali",10567);
        System.out.println(cc.name+" "+cc.emp_id);

    }
}
