package com.facundo.perez.schneider.entrevistatecnicainterbaking.service.impl;

import com.facundo.perez.schneider.entrevistatecnicainterbaking.dto.CompanyDTO;
import com.facundo.perez.schneider.entrevistatecnicainterbaking.service.CompaniesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompaniesServiceImpl implements CompaniesService {
    @Override
    public List<CompanyDTO> getCompaniesWithLastMonthTransfers() {
        return null;
    }

    @Override
    public List<CompanyDTO> getCompaniesAdheredLastMonth() {
        return null;
    }

    @Override
    public CompanyDTO adhereCompany(CompanyDTO companyDTO) {
        return null;
    }
}
