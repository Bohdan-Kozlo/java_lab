package ua.lviv.iot.algo.part1.lab4.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class SoftChair extends Chair {
    private String filler;
    private int depth;
    private boolean cushioning;
    public static final String HEADERS = " filler, depth, cushioning";

    public String getHeaders() {
        return super.getHeaders() + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + " , " + getFiller() + ", " + getDepth() + ", " + getCushioning();
    }

    public boolean getCushioning() {
        return cushioning;
    }

    public SoftChair(
            int id,
            String material,
            int maxWeight,
            String owner,
            String filler,
            int depth,
            boolean cushioning) {
        super(id, material, maxWeight, owner);
        this.filler = filler;
        this.depth = depth;
        this.cushioning = cushioning;
    }

}
