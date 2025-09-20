public class bulb implements factory{
    private final String id;
    private double battery;

    public bulb(String id) {
        this.id = id;
    }

    public void poweruse(double battery) {
        this.battery = battery;
    }

    @Override
    public void make() {
        System.out.println("A "+id+" brand bulb was made with a battery power of "+battery);
    }
}

