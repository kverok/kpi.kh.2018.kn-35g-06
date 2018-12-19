package ua.khpi.webtechnologies.karnaukh.portfolio.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.khpi.webtechnologies.karnaukh.portfolio.dto.ContactUsForm;

@Repository
public interface ContactUsRepository extends CrudRepository<ContactUsForm, Long> {

}
