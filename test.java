public class test {
    public static void main(String[] args) {
        smartdevice brandA = new brand_A();
        smartdevice brandB = new brand_B();

        factory bulbA = brandA.createBulb("Brand A");
        factory lockB = brandB.createLock("Brand B");
    }
}


