package com.tg.design.pattern.decorator;

import com.tg.design.pattern.decorator.printinvoice.FooterDecorator;
import com.tg.design.pattern.decorator.printinvoice.HeaderDecorator;
import com.tg.design.pattern.decorator.printinvoice.Order;
import com.tg.design.pattern.decorator.printinvoice.OrderLine;
import com.tg.design.pattern.decorator.printinvoice.SalesOrder;
import org.junit.Test;

import java.util.Date;

/**
 * @author tangang
 * @title PrintInvoiceTest
 * @date 2017/9/26
 */
public class PrintInvoiceTest {

    @Test
    public void testPrintInvoice(){

        Order order = new SalesOrder();

        order.setSalesDate(new Date());
        order.setCustomerNama("XYZ Repair Shop");

        OrderLine line1 = new OrderLine();
        line1.setItemName("FireWheel Tire");
        line1.setUnitPrice(154.23);
        line1.setUnits(4);
        order.addItem(line1);

        OrderLine line2 = new OrderLine();
        line2.setItemName("Front Fender");
        line2.setUnitPrice(200.23);
        line2.setUnits(1);
        order.addItem(line2);

        order = new HeaderDecorator(new FooterDecorator(order));

        order.print();

    }
}
