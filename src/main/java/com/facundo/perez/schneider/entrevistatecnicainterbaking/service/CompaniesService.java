package com.facundo.perez.schneider.entrevistatecnicainterbaking.service;

import com.facundo.perez.schneider.entrevistatecnicainterbaking.dto.CompanyDTO;

import java.util.*;

public interface CompaniesService {
    List<CompanyDTO> getCompaniesWithLastMonthTransfers();
    List<CompanyDTO> getCompaniesAdheredLastMonth();
    CompanyDTO adhereCompany(CompanyDTO companyDTO);
}
