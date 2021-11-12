package com.bbv.boot.conference.repository;

import com.bbv.boot.conference.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
