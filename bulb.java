public class bulb implements factory{
    private final String id;
    private double batry;

    public bulb(String id) {
        this.id = id;
    }

    public void poweruse(double batry) {
        this.batry = batry;
    }

    @Override
    public void make() {
        System.out.println("A "+id+" brand bulb was made with a battery power of "+batry);
    }
}
