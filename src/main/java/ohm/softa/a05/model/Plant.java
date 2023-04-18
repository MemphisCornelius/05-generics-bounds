package ohm.softa.a05.model;

public abstract class Plant implements Comparable<Plant>{
     private double height;
     private String family;
     private String name;

    public Plant(String family, String name, double height) {
        if (name == null)
            throw new IllegalArgumentException();
        if (family == null)
            throw new IllegalArgumentException();
        if (height < 0)
            throw new IllegalArgumentException();
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant o) {
        return Double.compare(this.getHeight(), o.getHeight());
    }
}
