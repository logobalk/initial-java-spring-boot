package com.siampharm.sampling.model.front;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class InspectionLot {
    private String inspectionStatus ;
    private String lotInspection ;
    private Timestamp dateTime ;
    private String matCode ;
    private String matName ;
    private String batch ;
    private String container ;
    private String lotContainer ;
    private String lotQty ;
    private String uom ;
    private String actualLotQty ;
    private String status ;
}
