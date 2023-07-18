public class Dog {

    Dog (){
        System.out.println("New dog!");
    }

    Dog(String message){
        System.out.println("New dog say " + message);
    }

    public void bark(){
        System.out.println("Гав");
    }

    public void bark(int count){
        for(int i = 0; i < count;i++) System.out.println("Гав(x"+(i+1)+")");
    }

    public void feed(int value, String food){
        System.out.println("Dog eats " + value + " of " + food);
    }

    public void feed(String food, int value){
        System.out.println("Dog eats " + food + ". Count of food is " + value);
    }

}
