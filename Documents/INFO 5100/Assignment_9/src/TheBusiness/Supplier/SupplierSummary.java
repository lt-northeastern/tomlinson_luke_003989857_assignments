/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Supplier;

import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author luke
 */
public class SupplierSummary {
    
    Supplier supplier;
    int totalsales;
    double loyaltyscore;
    int averagespending;
    double top5salesscore;

    public SupplierSummary(Supplier s, MasterOrderList masterorderlist, int numberofcustomers) {
        supplier = s;

        // two lists that line up: customers.get(i) spent sales.get(i) with this supplier
        ArrayList<CustomerProfile> customers = new ArrayList();
        ArrayList<Integer> sales = new ArrayList();

        for (Order order : masterorderlist.getOrders()) {
            for (OrderItem oi : order.getOrderItems()) {
                // only count items whose product belongs to this supplier
                if (supplier.getProductCatalog().getProductList().contains(oi.getSelectedProduct())) {
                    int amount = oi.getOrderItemTotal();
                    totalsales = totalsales + amount;

                    CustomerProfile customer = order.getCustomer();
                    int index = customers.indexOf(customer);
                    if (index == -1) {              // first time we see this customer
                        customers.add(customer);
                        sales.add(amount);
                    } else {                        // customer already in the list
                        sales.set(index, sales.get(index) + amount);
                    }
                }
            }
        }

        int differentcustomers = customers.size();
        if (differentcustomers == 0) {
            return;                                 // no sales: all scores stay 0
        }

        // Loyalty score = different customers / all customers
        loyaltyscore = (double) differentcustomers / numberofcustomers;

        // Average spending per customer = total sales / different customers
        averagespending = totalsales / differentcustomers;

        // Top 5 sales score = sales to the top 5 customers / total sales
        sales.sort((a, b) -> b - a);                // biggest first
        int top5 = 0;
        for (int i = 0; i < 5 && i < sales.size(); i++) {
            top5 = top5 + sales.get(i);
        }
        top5salesscore = (double) top5 / totalsales;
    }

    public String getSupplierName() {
        return supplier.getName();
    }

    public int getTotalSales() {
        return totalsales;
    }

    public double getLoyaltyScore() {
        return loyaltyscore;
    }

    public int getAverageSpending() {
        return averagespending;
    }

    public double getTop5SalesScore() {
        return top5salesscore;
    }
}
    

