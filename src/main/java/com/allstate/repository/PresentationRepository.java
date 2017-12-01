package com.allstate.repository;

import com.allstate.presentation.PresentationEntity;
import com.allstate.session.SessionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentationRepository extends CrudRepository<PresentationEntity, Long> {
}