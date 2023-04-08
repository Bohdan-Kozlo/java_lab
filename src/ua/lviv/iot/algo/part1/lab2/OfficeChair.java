package ua.lviv.iot.algo.part1.lab2;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OfficeChair extends Chair {
    private String chairType;
    private String materialOfUpholstery;
    private double currentInclineBack;

    public OfficeChair(
            int id,
            String material,
            int maxWeightChair,
            String owner,
            String chairType,
            String materialOfUpholstery,
            double currentInclineBack) {
        super(id, material, maxWeightChair, owner);
        this.chairType = chairType;
        this.materialOfUpholstery = materialOfUpholstery;
        this.currentInclineBack = currentInclineBack;
    }

    @Override
    public void adjustPosition(int value) {
        currentInclineBack += value;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chair Type: " + chairType + " , Material of Upholstery: " + materialOfUpholstery + " , Current Incline Back: " + currentInclineBack;
    }


}
