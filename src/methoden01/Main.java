package methoden01;

public class Main {
    public static void main(String[] args) {
        multiplikationWithResult(2,3);
    }

    private static int multiplikation(int value1, int value2) {
        return value1 * value2;
    }

    private static void multiplikationWithResult(int value1, int value2) {
        System.out.println("Produkt: " + multiplikation(value1,value2));
    }

}
