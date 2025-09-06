package co.com.pragma.r2dbc;

import co.com.pragma.model.loanapplication.entities.LoanApplication;
import co.com.pragma.model.loanapplication.ports.ILoanApplicationRepository;
import co.com.pragma.r2dbc.entities.LoanApplicationEntity;
import co.com.pragma.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class LoanApplicationRepositoryPortAdapter extends ReactiveAdapterOperations<
        LoanApplication/* change for domain model */,
        LoanApplicationEntity/* change for adapter model */,
        Long,
        ILoanApplicationEntityRepository
        > implements ILoanApplicationRepository {
    public LoanApplicationRepositoryPortAdapter(ILoanApplicationEntityRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, LoanApplication.class/* change for domain model */));
    }

    @Override
    public Mono<LoanApplication> findById(Long id) {
        return null;
    }
}
