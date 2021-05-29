package EFUB.commento.service;

import EFUB.commento.domain.Ex;
import EFUB.commento.domain.ExRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExampleService {
    private final ExRepository exrepository;

    public ExampleService(ExRepository exrepository) {
        this.exrepository = exrepository;
    }

    public List<Ex> getAll() {
        return exrepository.findAll();
    }

    public Ex getOneById(Long id) {
        return exrepository.findOneById(id);
    }

    public List<Ex> getListByCountry(String country) {
        return exrepository.findAllByCountry(country);
    }

    public Ex getOneByIdAndCountry(Long id, String country){
        return exrepository.findOneByIdAndCountry(id, country);
    }
}
