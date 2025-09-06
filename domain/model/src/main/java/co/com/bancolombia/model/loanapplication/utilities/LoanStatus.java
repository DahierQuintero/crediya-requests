package co.com.bancolombia.model.loanapplication.utilities;

import lombok.Getter;

@Getter
public enum LoanStatus {
    PENDING_REVIEW("Pendiente de revision"),
    APPROVED("Aprobado"),
    REJECTED("Rechazado");

    private final String status;

    LoanStatus(String status) {
        this.status = status;
    }
}
