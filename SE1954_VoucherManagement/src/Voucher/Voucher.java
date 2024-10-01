package Voucher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Voucher {
    int discountInPercentage;
    int maxDiscount;
    int minValueRequire;
    boolean isApplyPercent;
    boolean isApplyMaxValue;
    boolean isApplyMinValue;
    
    

    public Voucher() {
        discountInPercentage = 0;
        maxDiscount = 0;
        minValueRequire = 0;
    }

    public Voucher(int discountInPercentage, int maxDiscount, int minValueRequire, boolean isApplyPercent, boolean isApplyMaxValue, boolean isApplyMinValue) {
        this.discountInPercentage = discountInPercentage;
        this.maxDiscount = maxDiscount;
        this.minValueRequire = minValueRequire;
        this.isApplyPercent = isApplyPercent;
        this.isApplyMaxValue = isApplyMaxValue;
        this.isApplyMinValue = isApplyMinValue;
    }

    public int getPercent() {
        return discountInPercentage;
    }

    public void setPercent(int discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }

    public int getMax_value() {
        return maxDiscount;
    }

    public void setMax_value(int maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public int getMin_request() {
        return minValueRequire;
    }

    public void setMin_request(int minValueRequire) {
        this.minValueRequire = minValueRequire;
    }

    public boolean isIsApplyPercent() {
        return isApplyPercent;
    }

    public void setIsApplyPercent(boolean isApplyPercent) {
        this.isApplyPercent = isApplyPercent;
    }

    public boolean isIsApplyMaxValue() {
        return isApplyMaxValue;
    }

    public void setIsApplyMaxValue(boolean isApplyMaxValue) {
        this.isApplyMaxValue = isApplyMaxValue;
    }

    public boolean isIsApplyMinValue() {
        return isApplyMinValue;
    }

    public void setIsApplyMinValue(boolean isApplyMinValue) {
        this.isApplyMinValue = isApplyMinValue;
    }

    @Override
    public String toString() {
        return "Voucher{" + "discountInPercentage=" + discountInPercentage + ", maxDiscount=" + maxDiscount + ", minValueRequire=" + minValueRequire + ", isApplyPercent=" + isApplyPercent + ", isApplyMaxValue=" + isApplyMaxValue + ", isApplyMinValue=" + isApplyMinValue + '}';
    }
    
    
}
