package co.com.bancolombia.model.loanapplication.entities;

import co.com.bancolombia.model.loanapplication.utilities.LoanStatus;
import co.com.bancolombia.model.loanapplication.utilities.LoanType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder(toBuilder = true)
public class LoanApplication {
    private String id;
    private BigDecimal amount;
    private Byte deadline;
    private LoanType loanType;
    private LoanStatus loanStatus;
}
