package org.renan.model.actions;

import lombok.Data;
import org.renan.entities.ActionQueueModel;
import org.renan.enums.ActionQueueType;

@Data
public abstract class ActionQueueBase {

    protected ActionQueueType actionQueueType;
    protected Long customerId;
    protected String username;

    protected ActionQueueBase() {
    }

    protected ActionQueueBase(ActionQueueType actionQueueType, Long customerId, String username) {
        this.actionQueueType = actionQueueType;
        this.customerId = customerId;
        this.username = username;
    }

    public abstract ActionQueueModel buildActionEntity();

    protected abstract String getActionRole();

    public void sendMessageToKafka(ActionQueueModel actionQueueModel) {
    }

}
