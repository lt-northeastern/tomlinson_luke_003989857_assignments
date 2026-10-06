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
public class VehicleDirectory {

    ArrayList<Vehicle> vehicles;

    public VehicleDirectory() {
        vehicles = new ArrayList<Vehicle>();
    }

    public Vehicle addNewVehicle() {
        Vehicle newVehicle = new Vehicle();
        vehicles.add(newVehicle);
        return newVehicle;
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
    }
    
    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
        
    }
     public Vehicle searchById(int vehicleId) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == vehicleId) {
                return v;
            }
        }
        return null;
    }

    public ArrayList<Vehicle> searchByName(String name) {
        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getModel().equals(name)) {
                results.add(v);
            }
        }
        return results;
    }

}
    


