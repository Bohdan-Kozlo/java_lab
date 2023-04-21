package ua.lviv.iot.algo.part1.lab4;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class OfficeChair extends Chair {
    private String chairType;
    private String materialOfUpholstery;
    private int currentInclineBack;
    public static final String HEADERS = " chairType, materialOfUpholstery, currentInclineBack";

    public String getHeaders() {
        return super.getHeaders() + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + " , " + getChairType() + ", " + getMaterialOfUpholstery() + ", " + getCurrentInclineBack();
    }

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
