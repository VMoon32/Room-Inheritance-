package oop.parcial2.neighborhood;

public class Yard extends Room{
    private boolean grass;

    public Yard(int width, int height, String color, boolean grass) {
        super(width, height, color);
        this.grass = grass;
    }

    public boolean isGrass() {
        return grass;
    }

    public static YardBuilder builder(){
        return new YardBuilder();
    }
}
