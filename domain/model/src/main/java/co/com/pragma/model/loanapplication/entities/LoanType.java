package co.com.bancolombia.model.loanapplication.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class LoanType {
    private Byte id;
    private String name;
    private BigDecimal amountMin;
    private BigDecimal amountMax;
    private Byte interestRate;
    private Boolean isAvailable;
}
