package ua.lviv.iot.algo.part1.lab3;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class GameChair extends Chair {
    private int heightOfArmrests;
    private int maximumHeight;
    private int weightOfChair;

    public GameChair(
            int id,
            String material,
            int maxWeight,
            String owner,
            int heightOfArmrests,
            int maximumHeight,
            int weightOfChair) {
        super(id, material, maxWeight, owner);
        this.heightOfArmrests = heightOfArmrests;
        this.weightOfChair = weightOfChair;
        this.maximumHeight = maximumHeight;
    }

}
