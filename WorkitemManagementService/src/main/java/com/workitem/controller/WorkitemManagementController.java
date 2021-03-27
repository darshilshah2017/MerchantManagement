package com.workitem.controller;

import com.workitem.dto.WorkitemDetailsDTO;
import com.workitem.service.WorkitemManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workitem")
public class WorkitemManagementController {

    Logger logger = LoggerFactory.getLogger(WorkitemManagementController.class);

    @Autowired
    WorkitemManagementService service;

    @PostMapping
    public String createWorkitem(@RequestBody String request){
        logger.info("Create workitem request received: {}", request);
        throw new RuntimeException("Unable tp create workitem!");
        /*String workitemId = service.createWorkitem(request);
        logger.info("Create workitem response sent: {}", workitemId);
        return workitemId;*/
    }

    @GetMapping
    public WorkitemDetailsDTO getWorkitem(String workitemId){
        logger.info("Get workitem details request received: {}", workitemId);
        WorkitemDetailsDTO workitemDetailsDTO = service.getWorkitem(workitemId);
        logger.info("Get workitem details response sent: {}", workitemDetailsDTO);
        return workitemDetailsDTO;
    }
}
