package oop.parcial2.neighborhood;

public class LivingRoomBuilder {
    private int width;
    private int height;
    private String color;
    private int windows;
    private boolean tv;
    private boolean homeTheater;

    public LivingRoomBuilder width(final int width) {
        this.width = width;
        return this;
    }
    public LivingRoomBuilder height(final int height){
        this.height = height;
        return this;
    }
    public LivingRoomBuilder color(final String color){
        this.color = color;
        return this;
    }
    public LivingRoomBuilder windows(final int windows){
        this.windows = windows;
        return this;
    }
    public LivingRoomBuilder tv(final boolean tv){
        this.tv = tv;
        return this;
    }
    public LivingRoomBuilder homeTheater(final boolean homeTheater){
        this.homeTheater = homeTheater;
        return this;
    }
    public LivingRoom build(){
        return new LivingRoom(width, height, color, windows, tv, homeTheater);
    }
}
