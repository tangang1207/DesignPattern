package com.tg.design.pattern.decorator.printinvoice;

/**
 * @author tangang
 * @title FooterDecorator
 * @date 2017/9/26
 */
public class FooterDecorator extends OrderDecorator {
    public FooterDecorator(Order order) {
        super(order);
    }

    public void print(){
        super.order.print();
        printFooter();
    }

    private void printFooter(){
        System.out.println("=====================");
        System.out.println("Totalt\t\t\t" + formatCurrency(super.order.getGrandTotal()));
    }
}
