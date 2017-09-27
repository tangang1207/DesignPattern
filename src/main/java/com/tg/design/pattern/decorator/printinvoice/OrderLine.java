package com.tg.design.pattern.decorator.printinvoice;

import java.text.NumberFormat;

/**
 * @author tangang
 * @title OrderLine
 * @date 2017/9/26
 */
public class OrderLine {

    private String itemName;

    private int units;

    private double unitPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void printLine(){
        System.out.println(itemName + "\t" + units +"\t" + formatCurrency(unitPrice) + "\t" +
                formatCurrency(getSubtoal()));
    }

    /**
     * 小计金额的取值方法
     * @return
     */
    public double getSubtoal(){
        return unitPrice * units;
    }

    private String formatCurrency(double amnt){
        return NumberFormat.getCurrencyInstance().format(amnt);
    }
}
