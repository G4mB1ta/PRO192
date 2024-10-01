package Voucher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.lang.*;
import java.util.*;
import java.io.*;

public class ShopVoucher extends Voucher {

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "discountInPercentage=" + discountInPercentage + ", maxDiscount=" + maxDiscount + ", minValueRequire=" + minValueRequire + ", isApplyPercent=" + isApplyPercent + ", isApplyMaxValue=" + isApplyMaxValue + ", isApplyMinValue=" + isApplyMinValue + '}';
    }
}
