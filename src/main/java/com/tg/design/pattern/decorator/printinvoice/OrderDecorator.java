package com.tg.design.pattern.decorator.printinvoice;

/**
 * @author tangang
 * @title OrderDecorator
 * @date 2017/9/26
 */
public abstract  class OrderDecorator extends Order {

    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
        this.setSalesDate(order.getSalesDate());
        this.setCustomerNama(order.getCustomerNama());
    }

    public void print(){
        super.print();
    }
}
