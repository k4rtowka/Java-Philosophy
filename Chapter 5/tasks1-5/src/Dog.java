public class Dog {

    /**
     * Create new object and print
     */
    Dog (){
        System.out.println("New dog!");
    }

    /**
     * Create new object and print message
     * @param message
     */
    Dog(String message){
        System.out.println("New dog say " + message);
    }

    /**
     * Print 'Woof'
     */
    public void bark(){
        System.out.println("Гав");
    }

    /**
     * Print 'Woof' several times
     * @param count - number of times
     */
    public void bark(int count){
        for(int i = 0; i < count;i++) System.out.println("Гав(x"+(i+1)+")");
    }

    /**
     * Feed a dog
     * @param value - number of food
     * @param food - name of food
     */
    public void feed(int value, String food){
        System.out.println("Dog eats " + value + " of " + food);
    }

    /**
     * Another way to feed a dog
     * @param food - name of food
     * @param value - number of food
     */
    public void feed(String food, int value){
        System.out.println("Dog eats " + food + ". Count of food is " + value);
    }

}
