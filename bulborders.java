public class bulborders extends orders {
    @Override
    public factory createparts(String id) {
        return new bulb(id);
    }
}
