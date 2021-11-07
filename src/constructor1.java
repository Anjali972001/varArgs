public class constructor1 {
    /*
   * constructor is a block(which is almost similar to method)and having same name as that of class.
   * constructor does not have any return type even void as well.
   * the only access modifier applicable for the constructor is public , protected , default, private.
   * constructor executes automatically when the object is created.
   * *** constructor is used to initialize the object not to create the object.
     */
    String name;
    int emp_id;
    // without the constructor

    public static void main(String[] args) {
        constructor1 e1 = new constructor1();
        constructor1 e2 = new constructor1();
    }
}// output: blank
