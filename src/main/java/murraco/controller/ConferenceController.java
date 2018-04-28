package murraco.controller;

import murraco.domain.Conference;
import murraco.dto.ConferenceResponse;
import murraco.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/conference")
public class ConferenceController {

    @Autowired
    private ConferenceService conferenceService;

//    @GetMapping()
//    public ResponseEntity<ConferenceResponse> listAll(HttpServletRequest req) {
//        return conferenceService.listAllConference(req);
//    }

}
