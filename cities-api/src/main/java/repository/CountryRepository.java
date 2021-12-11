package repository;

//import com.git
import org.springframework.data.jpa.repository.JpaRepository;

import countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
