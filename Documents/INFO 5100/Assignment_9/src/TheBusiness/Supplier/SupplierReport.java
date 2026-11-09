/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Supplier;

import java.util.ArrayList;

/**
 *
 * @author luke
 */
public class SupplierReport {

    ArrayList<SupplierSummary> suppliersummarylist;

    public SupplierReport() {
        suppliersummarylist = new ArrayList();
    }

    public void addSupplierSummary(SupplierSummary ss) {
        suppliersummarylist.add(ss);
    }

    // suppliers sorted from highest total sales to lowest
    public ArrayList<SupplierSummary> getSuppliersSortedBySales() {
        suppliersummarylist.sort((a, b) -> b.getTotalSales() - a.getTotalSales());
        return suppliersummarylist;
    }
}
    

