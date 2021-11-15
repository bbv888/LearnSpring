package com.bbv.boot.conference.controller;


import com.bbv.boot.conference.model.Speaker;
import com.bbv.boot.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping("greeting")
    public String generateGreeting(Map<String, Object> model) {
        //model.put("message", DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss").format(LocalDateTime.now()));
        List<Speaker> currentSpeakers= speakerRepository.findAll();
        Speaker selectedSpeaker= currentSpeakers.get((int) (Math.random()*currentSpeakers.size()));

        model.put("message", "Random speaker is: "
                + selectedSpeaker.getFirst_name() + " "
                + selectedSpeaker.getLast_name());
        return "greeting";
    }
}
