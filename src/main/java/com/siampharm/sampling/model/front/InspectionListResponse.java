package com.siampharm.sampling.model.front;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class InspectionListResponse {
    private List<InspectionLot> inspectionList;
}
