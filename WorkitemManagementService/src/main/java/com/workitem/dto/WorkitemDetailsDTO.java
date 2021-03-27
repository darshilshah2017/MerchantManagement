package com.workitem.dto;

import com.workitem.entity.WorkitemDetails;

import java.util.Date;

public class WorkitemDetailsDTO {

    private String id;
    private String status;
    private String payload;
    private Date creationDate;

    public static WorkitemDetailsDTO valueOf(WorkitemDetails workitemDetails) {
        WorkitemDetailsDTO workitemDTO = new WorkitemDetailsDTO();
        workitemDTO.setId(workitemDetails.getId());
        workitemDTO.setPayload(workitemDetails.getPayload());
        workitemDTO.setStatus(workitemDetails.getStatus());
        workitemDTO.setCreationDate(workitemDetails.getCreationDate());

        return workitemDTO;
    }

    @Override
    public String toString() {
        return "WorkitemDetailsDTO{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", payload='" + payload + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
