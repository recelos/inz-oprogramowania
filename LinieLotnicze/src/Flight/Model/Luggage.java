package Flight.Model;

public class Luggage {
    private final double weight;
    private final double volume;

    public Luggage(double weight, double volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }
}
