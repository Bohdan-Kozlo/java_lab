package ua.lviv.iot.algo.part1.lab3;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class OfficeChair extends Chair {
    private String chairType;
    private String materialOfUpholstery;
    private int currentInclineBack;

    public OfficeChair(
            int id,
            String material,
            int maxWeightChair,
            String owner,
            String chairType,
            String materialOfUpholstery,
            int currentInclineBack) {
        super(id, material, maxWeightChair, owner);
        this.chairType = chairType;
        this.materialOfUpholstery = materialOfUpholstery;
        this.currentInclineBack = currentInclineBack;
    }

    @Override
    public void adjustPosition(int value) {
        currentInclineBack += value;
    }




}
