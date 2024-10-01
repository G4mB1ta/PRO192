package Voucher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.lang.*;
import java.util.*;
import java.io.*;

public class ShipVoucher extends Voucher {

    public ShipVoucher() {
        super();
    }

    public ShipVoucher(int discountInPercentage, int maxDiscount, int minValueRequire, boolean isApplyPercent, boolean isApplyMaxValue, boolean isApplyMinValue) {
        super(discountInPercentage, maxDiscount, minValueRequire, isApplyPercent, isApplyMaxValue, isApplyMinValue);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "discountInPercentage=" + discountInPercentage + ", maxDiscount=" + maxDiscount + ", minValueRequire=" + minValueRequire + ", isApplyPercent=" + isApplyPercent + ", isApplyMaxValue=" + isApplyMaxValue + ", isApplyMinValue=" + isApplyMinValue + '}';
    }
}
