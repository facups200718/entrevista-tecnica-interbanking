package com.facundo.perez.schneider.entrevistatecnicainterbaking.controller.impl;

import com.facundo.perez.schneider.entrevistatecnicainterbaking.controller.CompaniesController;
import com.facundo.perez.schneider.entrevistatecnicainterbaking.dto.CompanyDTO;
import com.facundo.perez.schneider.entrevistatecnicainterbaking.service.CompaniesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companies")
@RequiredArgsConstructor
public class CompaniesControllerImpl implements CompaniesController {
    private CompaniesService companiesService;
    @GetMapping
    @Override
    public ResponseEntity getCompaniesWithLastMonthTransfers() {
        return ResponseEntity.ok(companiesService.getCompaniesWithLastMonthTransfers());
    }

    @GetMapping
    @Override
    public ResponseEntity getCompaniesAdheredLastMonth() {
        return ResponseEntity.ok(companiesService.getCompaniesAdheredLastMonth());
    }

    @PostMapping
    @Override
    public ResponseEntity adhereCompany(CompanyDTO companyDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(companiesService.adhereCompany(companyDTO));
    }
}
