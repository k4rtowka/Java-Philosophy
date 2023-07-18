public class Main {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 1;
        dataOnly.d = 2.4;
        dataOnly.b = false;
        System.out.println("i = " + dataOnly.i + ", d = " + dataOnly.d + ", b = " + dataOnly.b);
    }
}// Output: i = 1, d = 2.4, b = false