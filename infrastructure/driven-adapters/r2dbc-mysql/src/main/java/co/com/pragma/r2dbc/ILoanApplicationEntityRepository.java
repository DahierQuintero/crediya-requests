package co.com.pragma.r2dbc;

import co.com.pragma.r2dbc.entities.LoanApplicationEntity;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ILoanApplicationEntityRepository extends ReactiveCrudRepository<LoanApplicationEntity, Long>, ReactiveQueryByExampleExecutor<LoanApplicationEntity> {
    Mono<LoanApplicationEntity> findById(Long id);

}
