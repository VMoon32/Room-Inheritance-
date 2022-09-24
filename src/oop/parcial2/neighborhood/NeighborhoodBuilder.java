package oop.parcial2.neighborhood;

import java.util.List;

public class NeighborhoodBuilder {
    private List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    public NeighborhoodBuilder streets(final List<Street> streets){
        this.streets = streets;
        return this;
    }
    public NeighborhoodBuilder gardens(final int gardens){
        this.gardens = gardens;
        return this;
    }
    public NeighborhoodBuilder basketballCourt(final boolean basketballCourt){
        this.basketballCourt = basketballCourt;
        return this;
    }
    public NeighborhoodBuilder footballCourt(final boolean footballCourt){
        this.footballCourt = footballCourt;
        return this;
    }
    public NeighborhoodBuilder swimmingPool(final boolean swimmingPool){
        this.swimmingPool = swimmingPool;
        return this;
    }

    public Neighborhood build(){
        return new Neighborhood(streets, gardens, basketballCourt, footballCourt, swimmingPool);
    }
}
