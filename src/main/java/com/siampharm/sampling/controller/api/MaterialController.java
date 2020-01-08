package com.siampharm.sampling.controller.api;

import com.siampharm.sampling.model.MaterialGroup;
import com.siampharm.sampling.model.MaterialType;
import com.siampharm.sampling.model.front.InspectionListResponse;
import com.siampharm.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping(value = "/type")
    public List<MaterialType> getMaterialType() {
        return materialService.getMaterialType();
    }

    @GetMapping(value = "/group")
    public ResponseEntity getMaterialGroup() {

        return new ResponseEntity(materialService.getMaterialGroup(), HttpStatus.OK);
    }

    @GetMapping(value = "/inspection-list")
    public ResponseEntity<InspectionListResponse> getMockInspectionList() {

        return new ResponseEntity<>(materialService.getMockInspectionList(), HttpStatus.OK);
    }
}
