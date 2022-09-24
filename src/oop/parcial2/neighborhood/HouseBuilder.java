package oop.parcial2.neighborhood;

import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRooms; //Aquí no es necesario el "= new..."
    private List<BedRoom> bedRooms;

    public HouseBuilder kitchen(final Kitchen kitchen){
        this.kitchen = kitchen;
        return this;
    }

    public HouseBuilder diningRoom(final DiningRoom diningRoom){
        this.diningRoom = diningRoom;
        return this;
    }

    public HouseBuilder livingRoom(final LivingRoom livingRoom){
        this.livingRoom = livingRoom;
        return this;
    }

    public HouseBuilder restRooms(final List<RestRoom> restRooms){
        this.restRooms = restRooms;
        return this;
    }

    public HouseBuilder bedRooms(final List<BedRoom> bedRooms){
        this.bedRooms = bedRooms;
        return this;
    }

    public House build(){
        return new House(kitchen, diningRoom, livingRoom, restRooms, bedRooms);
    }
}



/*class HouseBuilder{
  - Kitchen kitchen
  - DiningRoom diningRoom
  - LivingRoom livingRoom
  - List<RestRoom>  restRooms
  - List<BedRoom>  bedRooms


  + kitchen(kitchen: Kitchen): HouseBuilder
  + diningRoom(diningRoom: DiningRoom): HouseBuilder
  + livingRoom(livingRoom: LivingRoom): HouseBuilder
  + restRooms(restRooms: RestRooms): HouseBuilder
  + bedRooms(bedRooms: BedRooms): HouseBuilder

  +build(): House

}*/