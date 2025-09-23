public class brand_A implements smartdevice {
    @Override
    public factory createBulb(String id) {
        orders o = new bulborders();
        return o.orderparts(id);
    }

    @Override
    public factory createLock(String id) {
        orders o = new lockorders();
        return o.orderparts(id);
    }
}
