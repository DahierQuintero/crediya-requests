package co.com.pragma.model.loanapplication.ports;

import co.com.pragma.model.loanapplication.entities.LoanApplication;
import reactor.core.publisher.Mono;

public interface ILoanApplicationRepository {
    Mono<LoanApplication> findById(Long id);
}
