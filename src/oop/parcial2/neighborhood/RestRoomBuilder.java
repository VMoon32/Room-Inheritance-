package oop.parcial2.neighborhood;

public class RestRoomBuilder {
    private int width;
    private int height;
    private String color;
    private boolean showerCabin;


    public RestRoomBuilder width(final int width){
        this.width = width;
        return this;
    }
    public RestRoomBuilder height(final int height){
        this.height = height;
        return this;
    }
    public RestRoomBuilder color(final String color){
        this.color = color;
        return this;
    }
    public RestRoomBuilder showerCabin(final boolean showerCabin){
        this.showerCabin = showerCabin;
        return this;
    }

    public RestRoom build(){
        return new RestRoom(width, height, color, showerCabin);
    }
}
