public class lock implements factory{
    private final String id;
    private double power;

    public lock(String id) {
        this.id = id;
    }

    public void batrypower(double power){
        this.power = power;
    }

    @Override
    public void make() {
        System.out.println("A "+id+" brand locke was made and it uses a power of "+power+" watts");
    }
}
