package com.bbv.boot.conference.controller;

import com.bbv.boot.conference.model.Session;
import com.bbv.boot.conference.repository.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/session")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Session getSession(@PathVariable Long id) {
        return sessionRepository.getOne(id);
    }

    @PostMapping
    public Session createSession(@RequestBody final Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteSession(@PathVariable Long id) {
        //delete children?
        sessionRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Session updateSession(@PathVariable Long id, @RequestBody Session session) {
        //todo validate if attributes preset; wouldn't jackson unmarshall take care of this?
        Session existingSession = sessionRepository.getOne(id);
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepository.saveAndFlush(existingSession);
    }

}
