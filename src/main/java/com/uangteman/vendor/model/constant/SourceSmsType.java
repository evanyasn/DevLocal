package com.uangteman.vendor.model.constant;

/**
 * @author maryosandoz
 * 1 -> private
 * 2 -> workbench
 * 3 -> apps
 * 4 -> reply
 * 5 -> shell
 */

public enum SourceSmsType {
    PRIVATE(1),WORKBENCH(2),APPS(3),REPLY(4),SHELL(5);
    private int value;

    SourceSmsType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}