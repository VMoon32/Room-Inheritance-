package oop.parcial2.neighborhood;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRooms = new ArrayList<>(); //Aquí no es necesario el "= new..."  UPDATE: NO PUES SIEMPRE SI JAJAJA
    private List<BedRoom> bedRooms = new ArrayList<>();

    public HouseBuilder kitchen(final Kitchen kitchen){
        this.kitchen = kitchen;
        return this;
    }

    public HouseBuilder diningRoom(final DiningRoom diningRoom){
        this.diningRoom = diningRoom;
        return this;
    }

    public HouseBuilder livingRoom(LivingRoom livingRoom){ //Quitando el FINAL porque el final es para los que no quieres modificar
        this.livingRoom = livingRoom;
        return this;
    }

    public HouseBuilder restRooms(RestRoom restRooms){
        this.restRooms.add(restRooms);
        return this;
    }

    public HouseBuilder bedRooms(final BedRoom bedRooms){
        this.bedRooms.add(bedRooms);
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