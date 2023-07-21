public class Main {
    public static void main(String[] args) {
        Money money = new Money();
        for(Currency name : Currency.values()){
            money.setCurrency(name);
            money.describe();
        }
    }
}