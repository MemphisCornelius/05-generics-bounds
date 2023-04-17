package ohm.softa.a05.model;

public class Flower extends Plant{

    public Flower(double height, String family, String name) {

        super(height, family, name);
    }
    @Override
    public PlantColor getColor() {
        return null;
    }
}
