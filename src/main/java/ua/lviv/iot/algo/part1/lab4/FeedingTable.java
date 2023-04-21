package ua.lviv.iot.algo.part1.lab4;

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
    public static final String HEADERS = " maxHeightChair, minHeightChair, ageChild, currentHeightChar";

    public String getHeaders() {
        return super.getHeaders() + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + " , " + getMaxHeightChair() + ", " + getMinHeightChair() + ", " + getAgeChild() + ", " + getCurrentHeightChar();
    }

    @Override
    public void adjustPosition(int value) {
        currentHeightChar += value;
    }

    public FeedingTable(int id,
                        String material,
                        int maxWeight,
                        String owner,
                        int maxHeightChair,
                        int minHeightChair,
                        int currentHeightChar,
                        int ageChild) {
        super(id, material, maxWeight, owner);
        this.minHeightChair = minHeightChair;
        this.maxHeightChair = maxHeightChair;
        this.ageChild = ageChild;
        this.currentHeightChar = currentHeightChar;
    }
}
