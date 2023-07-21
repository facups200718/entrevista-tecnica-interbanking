package com.facundo.perez.schneider.entrevistatecnicainterbaking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferDTO {
    private Integer transferId;
    private Double amount;
    private Integer companyId;
    private String accountType;
}
