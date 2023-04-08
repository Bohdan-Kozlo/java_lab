package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Chair {
    protected int id;
    protected String material;
    protected int maxWeight;
    protected String owner;

    public void adjustPosition(int value) {
        maxWeight += value;
    }


    public void occupy(String owner) {
        this.owner = owner;
    }

    public void release() {
        this.owner = null;
    }

    public boolean isOccupied() {
        return this.owner != null;
    }

    @Override
    public String toString() {
        String seatOcuupiedStatus = isOccupied() ? "occupied by " + this.owner : "is not occupied";
        return ("Chair:" + this.id + ", " + "material:" + this.material + ", " + "maxWeight:" + this.maxWeight + ", " + seatOcuupiedStatus);
    }

}
