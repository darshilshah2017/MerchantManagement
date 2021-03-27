package com.workitem.service;

import com.workitem.dto.WorkitemDetailsDTO;
import com.workitem.entity.WorkitemDetails;
import com.workitem.exception.WorkitemManagementException;
import com.workitem.repository.WorkitemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkitemManagementService {

    Logger logger = LoggerFactory.getLogger(WorkitemManagementService.class);

    @Autowired
    WorkitemRepository repository;

    public String createWorkitem(String request) {
        WorkitemDetails workitemDetails = WorkitemDetails.valueOf(request);
        logger.info("Request entered service class");
        repository.save(workitemDetails);
        logger.info("Woritem created with id: {}", workitemDetails.getId());
        return workitemDetails.getId();
    }

    public WorkitemDetailsDTO getWorkitem(String workitem){
        logger.info("Request entered service class");
        Optional<WorkitemDetails> workitemDetails = repository.findById(workitem);

        if(!workitemDetails.isPresent()){
            logger.info("No workitem exists with id: {}", workitem);
            throw new WorkitemManagementException("No workitem exists with id: " + workitem);
        }

        logger.info("Fetched workitem details: {}", workitemDetails.get());
        return WorkitemDetailsDTO.valueOf(workitemDetails.get());
    }
}
