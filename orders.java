public abstract class orders {
    public String id;

    public orders() {
        this.id = id;
    }

    public factory orderparts(String id) {
        factory type = createparts(id);

        if (type instanceof bulb x) {
            x.poweruse(simbatteryusefromfile());
        }
        else if (type instanceof lock x) {
            x.batrypower(simbatteryusefromfile());
        }

        type.make();
        return type;
    }

    protected double simpowerusefromfile() {
        return 12341;
    }

    protected double simbatteryusefromfile() {
        return 1234;
    }

    public abstract factory createparts(String id);
}

