package com.bbv.boot.conference.repository;

import com.bbv.boot.conference.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
