package Flight.Model;

public class Airplane {

    private final int id;
    private final String name;
    private final int capacity;
    private final float luggageCapacity;
    private final float mileage;

    public Airplane(int id, String name, int capacity, float luggageCapacity, float mileage) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.luggageCapacity = luggageCapacity;
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public float getLuggageCapacity() {
        return luggageCapacity;
    }

    public float getMileage() {
        return mileage;
    }
}
