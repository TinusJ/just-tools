package com.tinusj.justtools.repository;

import com.tinusj.justtools.entity.ValidationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationResponseRepository extends JpaRepository<ValidationResponse, Long> {
}
