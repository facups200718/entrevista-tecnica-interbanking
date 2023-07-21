package com.facundo.perez.schneider.entrevistatecnicainterbaking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyDTO {
    private Integer id;
    private String cuit;
    private String businessName;
    private LocalDate adhesionDate;
    private List<TransferDTO> transfers;
}
