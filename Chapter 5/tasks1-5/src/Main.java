
public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Woof!");
        dog1.bark();
        dog2.bark(2);
        dog1.feed(2, "meat");
        dog2.feed("fish", 5);
    }
}