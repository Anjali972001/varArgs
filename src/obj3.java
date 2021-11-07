public class obj3 {
    String colour;
    int age;
    void info(String c , int a)
    {
        colour = c;
        age = a;
    }
    void display()
    {
        System.out.println(colour + " " + age);
    }

    public static void main(String[] args) {
        obj3 dog = new obj3();
        dog.info("black",10);
        dog.display();
    }
}
// output: black 10
//initializing an object by method.

