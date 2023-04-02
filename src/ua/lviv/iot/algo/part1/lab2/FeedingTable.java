package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FeedingTable extends Chair {
    private int maxWithChair;
    private int minWithChair;
    private int ageChild;

    public FeedingTable(int id,
                        String material,
                        int maxWeightCHAIR,
                        int minWithChair,
                        String owner,
                        int ageChild) {
        super(id, material, maxWeightCHAIR, owner);
        this.minWithChair = minWithChair;
        this.minWithChair = maxWeightCHAIR;
        this.ageChild = ageChild;
    }

    @Override
    public void adjustPosition(int value) {
        maxWithChair += value;
        minWithChair += value;
    }

    @Override
    public String toString() {
        return super.toString() + ", maxWithChair:" + minWithChair + " , minWithChair: " + minWithChair + " ,age Child: " + ageChild;
    }


}
