package com.tinusj.justtools.repository;

import com.tinusj.justtools.entity.ValidationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationRequestRepository extends JpaRepository<ValidationRequest, Long>{
}
