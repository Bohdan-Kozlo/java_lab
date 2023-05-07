package ua.lviv.iot.algo.part1.lab4.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Chair {
    private int id;
    private String material;
    private int maxWeight;
    private String owner;
    public static final String HEADERS = "id, material, maxWeight, owner,";

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return getId() + ", " + getMaterial() + ", " + getMaxWeight() + ", " + getOwner();
    }

    public void adjustPosition(int value) {

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

}
