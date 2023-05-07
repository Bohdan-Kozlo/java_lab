package ua.lviv.iot.algo.part1.lab6.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public abstract class Chair {
    private Integer id;
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
