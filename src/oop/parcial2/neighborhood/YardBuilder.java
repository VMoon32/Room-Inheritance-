package oop.parcial2.neighborhood;

public class YardBuilder {
    private int width;
    private int height;
    private String color;
    private boolean grass;

    public YardBuilder width(final int width){
        this.width = width;
        return this;
    }
    public YardBuilder height(final int height){
        this.height = height;
        return this;
    }
    public YardBuilder color(final String color){
        this.color = color;
        return this;
    }
    public YardBuilder grass(final boolean grass){
        this.grass = grass;
        return this;
    }

    public Yard build(){
        return new Yard(width, height, color, grass);
    }
}
