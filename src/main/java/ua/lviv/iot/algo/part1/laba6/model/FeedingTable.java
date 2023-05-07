package ua.lviv.iot.algo.part1.laba6.model;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class FeedingTable extends Chair {
    private int maxHeightChair;
    private int minHeightChair;
    private int ageChild;
    private int currentHeightChar;

    public static final String HEADERS = " maxHeightChair, minHeightChair, ageChild, currentHeightChar";

    public String getHeaders() {
        return super.getHeaders() + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + " , " + getMaxHeightChair() + ", " + getMinHeightChair() + ", " + getAgeChild() + ", "
                + getCurrentHeightChar();
    }

    public FeedingTable(Integer id,
                        String material,
                        int maxWeight,
                        String owner,
                        int maxHeightChair,
                        int minHeightChair,
                        int currentHeightChar,
                        int ageChild) {
        super(id, material, maxWeight, owner);
        this.maxHeightChair = maxHeightChair;
        this.minHeightChair = minHeightChair;
        this.currentHeightChar = currentHeightChar;
        this.ageChild = ageChild;
    }

    public void adjustPosition(int value) {
        currentHeightChar += value;
    }

}
