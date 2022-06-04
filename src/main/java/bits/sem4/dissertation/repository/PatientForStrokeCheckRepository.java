package bits.sem4.dissertation.repository;

import bits.sem4.dissertation.data.entity.PatientsForStrokeCheck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientForStrokeCheckRepository extends CrudRepository<PatientsForStrokeCheck, Long> {
}

