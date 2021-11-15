package com.bbv.boot.conference.controller;


import com.bbv.boot.conference.model.Attendee;
import com.bbv.boot.conference.repository.AttendeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private AttendeeController attendeeController;

    public RegistrationController(AttendeeController attendeeController) {
        this.attendeeController = attendeeController;
    }

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("attendee") Attendee attendee) {
        return "registration";
    }

    @PostMapping("registration")
    public String postRegistration(@ModelAttribute("attendee") Attendee attendee) {
        System.out.println(attendee.getFirst_name());
        attendeeController.createAttendee(attendee);
        return "redirect:registration";
    }
}
