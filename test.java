public class test {
    public static void main(String[] args) {
        orders Bulb_A = new bulborders();
        orders Lock_B = new lockorders();

        factory FactoryA = Bulb_A.orderparts("company A");
        factory FactoryB = Lock_B.orderparts("company B");
    }
}
