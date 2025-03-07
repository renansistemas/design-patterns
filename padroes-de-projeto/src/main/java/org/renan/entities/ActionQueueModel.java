package org.renan.entities;

import lombok.Data;

@Data
public class ActionQueueModel {

    private Long id;
    private Integer actionType;
    private Long customerId;
    private String createdBy;

    public ActionQueueModel() {
    }

    public ActionQueueModel(Long id, Integer actionType, Long customerId, String createdBy) {
        this.id = id;
        this.actionType = actionType;
        this.customerId = customerId;
        this.createdBy = createdBy;
    }

}
