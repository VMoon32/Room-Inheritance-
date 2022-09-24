package oop.parcial2.neighborhood;

public class DiningRoomBuilder {
    private int width;
    private int height;
    private String color;
    private int windows;
    private boolean tv;
    private int chairsCapacity;


    public DiningRoomBuilder width(final int width){
        this.width = width;
        return this;
    }
    public DiningRoomBuilder height(final int height){
        this.height = height;
        return this;
    }
    public DiningRoomBuilder color(final String color){
        this.color = color;
        return this;
    }
    public DiningRoomBuilder windows(final int windows){
        this.windows = windows;
        return this;
    }
    public DiningRoomBuilder tv(final boolean tv){
        this.tv = tv;
        return this;
    }
    public DiningRoomBuilder chairsCapacity(final int chairsCapacity){
        this.chairsCapacity = chairsCapacity;
        return this;
    }

    public DiningRoom build(){
        return new DiningRoom(width, height, color, windows, tv, chairsCapacity);
    }
}
