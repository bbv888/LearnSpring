package com.bbv.boot.conference.controller;

import com.bbv.boot.conference.model.Speaker;
import com.bbv.boot.conference.repository.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speaker")
public class SpeakerController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Speaker getSpeaker(@PathVariable Long id) {
        return speakerRepository.getOne(id);
    }

    @PostMapping
    public Speaker createSpeaker(@RequestBody final Speaker speaker) {
        return speakerRepository.saveAndFlush(speaker);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSpeaker(@PathVariable Long id) {
        //delete children?
        speakerRepository.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Speaker updateSpeaker(@PathVariable Long id, @RequestBody Speaker speaker) {
        //todo validate if attributes preset; wouldn't jackson unmarshall take care of this?
        Speaker existingSpeaker = speakerRepository.getOne(id);
        BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");
        return speakerRepository.saveAndFlush(existingSpeaker);
    }
}
