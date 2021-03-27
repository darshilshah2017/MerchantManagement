package com.merchant.repository;

import com.merchant.entity.MerchantManagement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantRepository extends JpaRepository<MerchantManagement, String> {

    public List<MerchantManagement> findByContactDetails_MobileNumber(long mobileNumber);
}
