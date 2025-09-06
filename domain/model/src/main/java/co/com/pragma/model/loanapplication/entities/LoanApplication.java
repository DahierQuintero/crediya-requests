package co.com.pragma.model.loanapplication.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class LoanApplication {
    private Long id;
    private BigDecimal amount;
    private Byte deadline;
    private Byte idLoanStatus;
    private Byte idLoanType;
}
