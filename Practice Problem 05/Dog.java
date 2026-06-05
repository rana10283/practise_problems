public class Dog {

    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking: Woof Woof!");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void spin() {
        System.out.println(name + " is doing a spin.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
 
    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");

        dog1.displayInfo();
        dog1.bark();
        dog1.run();
        dog1.spin();
    }
}
