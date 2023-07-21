public class Money {
    Currency currency;

    public void setCurrency(Currency currency){
        this.currency = currency;
    }
    public void describe(){
        switch (currency){
            case CAD -> System.out.println("Canadian dollar " + currency.ordinal());
            case CZK -> System.out.println("Czech Koruna " + currency.ordinal());
            case EUR -> System.out.println("Euro " + currency.ordinal());
            case RUB -> System.out.println("Ruble " + currency.ordinal());
            case UAH -> System.out.println("Ukrainian Hryvnia " + currency.ordinal());
            case USD -> System.out.println("Dollar " + currency.ordinal());
        }
    }
}
