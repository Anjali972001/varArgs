public class constructor2 {
    String name;
    int emp_id;
    constructor2(String name,int emp_id){
        this.name=name;
        this.emp_id=emp_id;

    }

    public static void main(String[] args) {
        constructor2 e1 = new constructor2("Anjali",10563);
        constructor2 e2 = new constructor2("akash",12345);
        System.out.println(e1.name+" "+ e1.emp_id);
        System.out.println(e2.emp_id+ " "+ e2.name);
    }

}
