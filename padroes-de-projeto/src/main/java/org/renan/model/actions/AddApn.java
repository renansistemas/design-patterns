package org.renan.model.actions;

import lombok.Getter;
import lombok.Setter;
import org.renan.entities.ActionQueueModel;
import org.renan.enums.ActionQueueType;

@Getter
@Setter
public class AddApn extends ActionQueueBase {

    private String apn;

    public AddApn(String apn) {
        this.apn = apn;
    }

    public AddApn(Long customerId, String username, String apn) {
        super(ActionQueueType.ADD_APN, customerId, username);
        this.apn = apn;
    }

    @Override
    public ActionQueueModel buildActionEntity() {
        ActionQueueModel actionQueueModel = new ActionQueueModel();
        actionQueueModel.setActionType(ActionQueueType.ADD_APN.getCode());
        actionQueueModel.setCustomerId(customerId);
        actionQueueModel.setCreatedBy(username);
        sendMessageToKafka(actionQueueModel);
        return actionQueueModel;
    }

    @Override
    protected String getActionRole() {
        return "role-add-apn";
    }
}
