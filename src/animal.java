public class animal {
    void eat()
    {
        System.out.println("I am eating.");
    }
    void run()
    {
        System.out.println("I am running.");
    }

    public static void main(String[] args) {
        animal dog = new animal();
        animal cat= new animal();
        dog.eat();
        cat.eat();
        dog.run();
        cat.run();
    }
}

