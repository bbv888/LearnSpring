package com.bbv.repository;

import com.bbv.model.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double secretNumber;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("FirstName");
        speaker.setLastName("LastName");
        speaker.setSecretNumber(secretNumber);

        speakers.add(speaker);

        return speakers;
    }

}