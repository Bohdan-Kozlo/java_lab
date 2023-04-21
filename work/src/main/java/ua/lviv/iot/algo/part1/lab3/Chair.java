package ua.lviv.iot.algo.part1.lab3;


;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Chair {
    private int id;
    private String material;
    private int maxWeight;
    private String owner;

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
