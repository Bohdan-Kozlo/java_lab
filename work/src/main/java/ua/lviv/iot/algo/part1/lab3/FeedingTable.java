package ua.lviv.iot.algo.part1.lab3;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class FeedingTable extends Chair {
    private int maxHeightChair;
    private int minHeightChair;
    private int ageChild;
    private int currentHeightChar;


    public FeedingTable(int id,
                        String material,
                        int maxWeight,
                        int maxHeightChair,
                        int minHeightChair,
                        int currentHeightChar,
                        String owner,
                        int ageChild) {
        super(id, material, maxWeight, owner);
        this.minHeightChair = minHeightChair;
        this.maxHeightChair = maxHeightChair;
        this.ageChild = ageChild;
        this.currentHeightChar = currentHeightChar;
    }

    @Override
    public void adjustPosition(int value) {
        currentHeightChar += value;
    }




}
