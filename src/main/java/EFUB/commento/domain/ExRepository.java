package EFUB.commento.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExRepository extends JpaRepository<Ex, Long> {
    List<Ex> findAllByCountry(String country);
    Ex findOneById(Long id);
    Ex findOneByIdAndCountry(Long id, String country);
}
