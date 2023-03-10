package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Chair {
    private int id;
    private String material;
    private int maxWeight;
    private String owner;
    private static Chair instance;

    public static Chair getInstance() {
        if (instance == null) {
            instance = new Chair();
        }
        return instance;

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

    public static void main(String[] args) {
        Chair[] chairs = new Chair[4];
        chairs[0] = new Chair();
        chairs[0].setId(200);
        chairs[0].setMaterial("plastic");
        chairs[0].occupy("Bob");
        chairs[0].setMaxWeight(100);
        chairs[1] = new Chair(100, "tree", 40, "Bohdan");
        chairs[1].release();
        System.out.println(chairs[1].toString());
        chairs[2] = getInstance();
        chairs[3] = getInstance();
        int i = 0;
        while (i < chairs.length) {
            System.out.println("Object identifier: " + chairs[i].hashCode());
            i++;
        }


    }
}
