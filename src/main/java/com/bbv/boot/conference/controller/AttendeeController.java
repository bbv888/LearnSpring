package com.bbv.boot.conference.controller;

import com.bbv.boot.conference.model.Attendee;
import com.bbv.boot.conference.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttendeeController {

    @Autowired
    private AttendeeRepository attendeeRepository;

    @GetMapping("/api/v1/attendee")
    public List<Attendee> getAllAttendees(){
        return attendeeRepository.findAll();
    }
    @GetMapping("/api/v1/attendee/{id}")
    public Attendee getSpecificAttendee(@PathVariable Long id){
        return attendeeRepository.findById(id).get();
    }

    @PostMapping("/api/v1/attendee")
    public Attendee createAttendee(@RequestBody Attendee attendee){
        return attendeeRepository.saveAndFlush(attendee);
    }
}
