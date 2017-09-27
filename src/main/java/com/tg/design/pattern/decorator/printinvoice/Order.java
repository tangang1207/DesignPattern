package com.tg.design.pattern.decorator.printinvoice;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

/**
 * @author tangang
 * @title Order
 * @date 2017/9/26
 */
public abstract class Order {

    private OrderLine lnkOrderLine;

    protected String customerNama;

    protected Date salesDate;

    protected Vector items = new Vector(10);



    public void print() {
        for (int i = 0; i < items.size(); i++) {
            OrderLine item = (OrderLine) items.get(i);
            item.printLine();

        }
    }

    public String getCustomerNama() {
        return customerNama;
    }

    public void setCustomerNama(String customerNama) {
        this.customerNama = customerNama;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public void addItem(OrderLine item){
        items.add(item);
    }

    public void removeItem(OrderLine item){
        items.remove(item);
    }

    public double getGrandTotal(){
        double amnt = 0.0d;
        for(int i = 0;i<items.size();i++){
            OrderLine item = (OrderLine) items.get(i);
            amnt += item.getSubtoal();
        }
        return amnt;
    }

    protected String formatCurrency(double amnt){
        return NumberFormat.getCurrencyInstance().format(amnt);
    }

}
