package ua.khpi.webtechnologies.karnaukh.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.khpi.webtechnologies.karnaukh.portfolio.dto.ContactUsForm;
import ua.khpi.webtechnologies.karnaukh.portfolio.service.ContactUsService;

@RestController
public class MainController {

    @Autowired
    private ContactUsService contactUsService;

    @PostMapping("/test")
    public void post(@RequestBody ContactUsForm contactUsForm) {
        contactUsService.addContactUsRequest(contactUsForm);
    }
}
