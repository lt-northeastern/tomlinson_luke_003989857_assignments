/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luke
 */
public class Service {
    
    int serviceID;
    String serviceType;
    double cost;
    String mechanicName;
    float serviceDuration;

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public float getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(float serviceDuration) {
        this.serviceDuration = serviceDuration;
    }
    
    @Override
    public String toString() {
        return serviceType;
    }
    
}
