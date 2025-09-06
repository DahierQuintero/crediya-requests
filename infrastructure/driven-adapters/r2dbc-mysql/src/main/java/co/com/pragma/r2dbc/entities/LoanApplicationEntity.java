package co.com.pragma.r2dbc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("loan_application")
public class LoanApplicationEntity {
    @Id
    @Column("id_loan_application")
    private Long id;
    private BigDecimal amount;
    @Column("dead_line")
    private Byte deadline;
    @Column("id_loan_status")
    private Byte idLoanStatus;
    @Column("id_loan_type")
    private Byte idLoanType;
}