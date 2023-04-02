package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoftChair extends Chair {
    private String filler;
    private int depth;
    private boolean cushioning;

    public SoftChair(
            int id,
            String material,
            int maxWeight,
            String owner,
            String filler,
            int depth,
            boolean cushioning)
    {
        super(id, material, maxWeight, owner);
        this.filler = filler;
        this.cushioning = cushioning;
    }

    @Override
    public String toString() {
        return super.toString() + ", Filler: " + filler + " , Depth: " + depth + " , Cushioning: " + cushioning;
    }


}
