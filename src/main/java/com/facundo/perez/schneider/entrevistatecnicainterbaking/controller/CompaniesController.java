package com.facundo.perez.schneider.entrevistatecnicainterbaking.controller;


import com.facundo.perez.schneider.entrevistatecnicainterbaking.dto.CompanyDTO;
import org.springframework.http.ResponseEntity;

public interface CompaniesController {
    ResponseEntity getCompaniesWithLastMonthTransfers();
    ResponseEntity getCompaniesAdheredLastMonth();
    ResponseEntity adhereCompany(CompanyDTO companyDTO);
}
