package com.tg.design.pattern.decorator.printinvoice;

/**
 * @author tangang
 * @title HeaderDecorator
 * @date 2017/9/26
 */
public class HeaderDecorator extends OrderDecorator {
    public HeaderDecorator(Order order) {
        super(order);
    }

    public void print(){
        this.printHeader();
        super.order.print();

    }

    private void printHeader(){
        System.out.println("\t***\tI N V O I C E\t***");
        System.out.println("XYZ, Incorporated\nDate of Sale: ");
        System.out.println(order.getSalesDate());
        System.out.println("===================================");
        System.out.println("Item\t\tUnits\tUnit Price\tSubtoal");
    }
}
