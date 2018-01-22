package com.uangteman.vendor.model.constant;

/**
 * @author maryosandoz
 * 1 -> hmin15
 * 2 -> hmin10
 * 3 -> hmin5
 * 4 -> hmin3
 * 5 -> hmin2
 * 6 -> hmin1
 * 7 -> h0
 * 8 -> hplus1
 * 9 -> hplus2
 * 10 -> hplus3
 */
public enum KokattoSubApp {
    hmin15(1), hmin10(2), hmon5(3), hmin3(4), hmin2(5), hmin1(6), h0(7), hplus1(8), hplus2(9), hplus3(10);
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    KokattoSubApp(int value) {
        this.value = value;
    }
}
