package com.nttdata.bc19.msproductpasive.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasiveProduct extends BaseModel {
    private String name;
    private double maintenanceCommission;
    private double transactionCommission;
    private double minimumOpeningAmount;
    private int numLimitMovements;
    private Boolean allowBusinessClient;
    private Boolean allowPersonClient;
}
