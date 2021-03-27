package com.workitem.repository;

import com.workitem.entity.WorkitemDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkitemRepository extends JpaRepository<WorkitemDetails, String> {

}
