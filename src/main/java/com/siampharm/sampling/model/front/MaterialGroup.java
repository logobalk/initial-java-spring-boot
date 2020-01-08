package com.siampharm.sampling.model.front;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MaterialGroup {
    private String id;
    private String inspectionLotOrigin;
    private String queue;
    private String itemCode;
    private String itemName;
    private String batchNo;
    private String storageLocation;
    private String bin;
    private int normalPlan;
    private int deviationPlan;
    private int totalSampling;
}
