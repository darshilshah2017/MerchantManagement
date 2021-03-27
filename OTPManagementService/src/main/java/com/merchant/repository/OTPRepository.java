package com.merchant.repository;

import com.merchant.entity.OTPDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OTPRepository extends JpaRepository<OTPDetails, Long> {
}
