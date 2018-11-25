package ua.khpi.webtechnologies.karnaukh.portfolio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.khpi.webtechnologies.karnaukh.portfolio.dto.ContactUsForm;
import ua.khpi.webtechnologies.karnaukh.portfolio.repo.ContactUsRepository;
import ua.khpi.webtechnologies.karnaukh.portfolio.service.ContactUsService;

@Service
public class DefaultContactUsService implements ContactUsService {
    @Autowired
    private ContactUsRepository contactUsRepository;

    @Override
    public void addContactUsRequest(final ContactUsForm contactUsForm) {
        contactUsRepository.save(contactUsForm);
    }
}
