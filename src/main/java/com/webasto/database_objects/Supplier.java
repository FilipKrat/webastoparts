/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webasto.database_objects;

/**
 *
 * @author FilipKrat
 */
public class Supplier {
    private int supplierId;
    private String supplierName;
    private int transportFrequency;
    private Transport transport;

    public Supplier(int supplierId, String supplierName, int transportFrequency) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.transportFrequency = transportFrequency;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getTransportFrequency() {
        return transportFrequency;
    }

    public void setTransportFrequency(int transportFrequency) {
        this.transportFrequency = transportFrequency;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
    
}
