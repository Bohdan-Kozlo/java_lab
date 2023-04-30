package ua.lviv.iot.algo.part1.lab4;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class GameChair extends Chair {
    private int heightOfArmrests;
    private int maximumHeight;
    private int weightOfChair;
    public static final String HEADERS = "heightOfArmrests, maximumHeight, weightOfChair";

    public String getHeaders() {
        return super.getHeaders() + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + " , " + getHeightOfArmrests() + ", " + getMaximumHeight() + ", " + getWeightOfChair();
    }

    public GameChair(
            int id,
            String material,
            int maxWeight,
            String owner,
            int heightOfArmrests,
            int maximumHeight,
            int weightOfChair
    ) {
        super(id, material, maxWeight, owner);
        this.heightOfArmrests = heightOfArmrests;
        this.maximumHeight = maximumHeight;
        this.weightOfChair = weightOfChair;
    }

}
