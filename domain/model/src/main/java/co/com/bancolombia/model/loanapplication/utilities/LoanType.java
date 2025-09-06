package co.com.bancolombia.model.loanapplication.utilities;

import lombok.Getter;

@Getter
public enum LoanType {
    FREE_INVESTMENT_LOAN("Préstamo de libre inversión"),
    VEHICLE_LOAN("Préstamo de vehículo"),
    MORTGAGE_LOAN("Crédito hipotecario"),
    PAYROLL_LOAN("Crédito de nómina"),
    EDUCATIONAL_LOAN("Crédito educativo"),
    CREDIT_CARD_LOAN("Tarjeta de crédito"),
    MICRO_LOAN("Microcrédito"),
    CONSUMER_LOAN("Préstamo de consumo");

    private final String description;

    LoanType(String description) {
        this.description = description;
    }
}
