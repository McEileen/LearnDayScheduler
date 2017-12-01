package com.allstate.repository;

import com.allstate.entities.Dog;
import com.allstate.session.SessionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<SessionEntity, Long> {
}