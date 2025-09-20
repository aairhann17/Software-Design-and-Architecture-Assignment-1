public class lockorders extends orders {
    @Override
    public factory createparts(String id) {
        return new lock(id);
    }
}
