package com.siampharm.service;

import com.siampharm.repository.MaterialGroupRepository;
import com.siampharm.repository.MaterialTypeRepository;
import com.siampharm.sampling.model.MaterialType;
import com.siampharm.sampling.model.front.InspectionListResponse;
import com.siampharm.sampling.model.front.InspectionLot;
import com.siampharm.sampling.model.front.MaterialGroup;
import com.siampharm.sampling.utility.MockUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialTypeRepository materialTypeRepository;

    @Autowired
    private MaterialGroupRepository materialGroupRepository;

    public List<MaterialType> getMaterialType() {
        return materialTypeRepository.findAll();
    }

    public List<MaterialGroup> getMaterialGroup() {
        // Page<MaterialGroup> materialGroups = materialGroupRepository.findAll(PageRequest.of(1, 10));
        List<MaterialGroup> materialGroups = new ArrayList<>();
        for(int i=0; i<10 ; i++) {
            MaterialGroup materialGroup = MaterialGroup.builder()
                    .id(String.valueOf(i + 1))
                    .batchNo("M000000" + MockUtility.randomNumberString(false,3))
                    .inspectionLotOrigin(MockUtility.randomInspectionLotOrigin())
                    .queue(MockUtility.randomNumberString(false,1))
                    .itemCode("1000000" + MockUtility.randomNumberString(false,1))
                    .itemName("Hydroxine Di Hydrochloride")
                    .storageLocation("SB00")
                    .bin("F1:01:13")
                    .normalPlan(0)
                    .deviationPlan(0)
                    .totalSampling(0)
                    .build();
            materialGroups.add(materialGroup);
        }
        return materialGroups;
    }

    public InspectionListResponse getMockInspectionList() {
        InspectionListResponse response = InspectionListResponse.builder().build();
        List<InspectionLot> lots = new ArrayList<>();
            for(int i = 0; i < 20; i++){
                String amount = MockUtility.randomFormatNumberString(20,".",999);
                String inspectionLot = MockUtility.randomInspectionLot();
                InspectionLot lot = InspectionLot.builder()
                        .inspectionStatus("10".equals(inspectionLot) ? MockUtility.randomInspectionStatus() : "2")
                        .lotInspection(inspectionLot + "0000" + MockUtility.randomNumberString(false, 4))
                        .dateTime(new Timestamp(System.currentTimeMillis()))
                        .matCode(MockUtility.randomNumberString(false,10))
                        .matName(MockUtility.randomMaterial())
                        .batch(MockUtility.randomNumberString(false,10))
                        .container("-")
                        .lotContainer("-")
                        .lotQty(amount)
                        .uom("KG")
                        .actualLotQty(amount)
                        .status(MockUtility.randomMaterialStatus())
                        .build();

                lots.add(lot);
            }
            response.setInspectionList(lots);
            return response;
    }
}
