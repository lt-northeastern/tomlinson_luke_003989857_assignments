/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author luke
 */
public class ServiceCatalog {

    ArrayList<Service> services;

    public ServiceCatalog() {
        services = new ArrayList<Service>();
    }

    public Service addNewService() {
        Service newService = new Service();
        services.add(newService);
        return newService;

    }

    public void removeService(Service s) {
        services.remove(s);
    }

    public ArrayList<Service> getServices() {
        return services;

    }

}
