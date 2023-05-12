package com.employment.network.repository;

import com.jobs.jobsearch.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findByUserId(Long userId);
}
