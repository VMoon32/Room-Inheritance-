package oop.parcial2.neighborhood;

public class BedRoomBuilder {
    private int width;
    private int height;
    private String color;
    private BedSize bedSize;
    private boolean tv;


    public BedRoomBuilder width(final int width){
        this.width = width;
        return this;
    }
    public BedRoomBuilder height(final int height){
        this.height = height;
        return this;
    }
    public BedRoomBuilder color(final String color){
        this.color = color;
        return this;
    }
    public BedRoomBuilder bedSize(final BedSize bedSize){
        this.bedSize = bedSize;
        return this;
    }
    public BedRoomBuilder tv(final boolean tv){
        this.tv = tv;
        return this;
    }

    public BedRoom build(){
        return new BedRoom(width, height, color, bedSize, tv);
    }
}
