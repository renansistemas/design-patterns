package org.renan.enums;

import lombok.Getter;

@Getter
public enum ActionQueueType {

    ADD_APN(1),
    REMOVE_APN(2),
    RESET_NETWORK(3),
    UNKNOWN(-1);

    private final Integer code;

    ActionQueueType(Integer code) {
        this.code = code;
    }

    public static ActionQueueType getByCode(Integer code) {
        for (ActionQueueType actionQueueType : values()) {
            if (actionQueueType.code.equals(code)) {
                return actionQueueType;
            }
        }
        return UNKNOWN;
    }

}
