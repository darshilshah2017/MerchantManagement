package com.workitem.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class WorkitemDetails {

    @Id
    private String id;
    private String status;
    @Column(length = 4000)
    private String payload;
    @Temporal(TemporalType.DATE)
    private Date creationDate;

    public static WorkitemDetails valueOf(String request) {
        WorkitemDetails workitemDetails = new WorkitemDetails();
        workitemDetails.setPayload(request);
        workitemDetails.setId(UUID.randomUUID().toString());
        workitemDetails.setStatus("NEW");
        workitemDetails.setCreationDate(new Date());

        return workitemDetails;
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
