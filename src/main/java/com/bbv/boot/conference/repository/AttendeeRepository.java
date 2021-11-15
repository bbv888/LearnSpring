package com.bbv.boot.conference.repository;

import com.bbv.boot.conference.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
