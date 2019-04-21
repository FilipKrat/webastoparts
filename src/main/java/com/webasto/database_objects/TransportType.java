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
public class TransportType {
    private String transportTypeShort;
    private String transportType;

    public TransportType(String transportTypeShort, String transportType) {
        this.transportTypeShort = transportTypeShort;
        this.transportType = transportType;
    }

    public String getTransportTypeShort() {
        return transportTypeShort;
    }

    public void setTransportTypeShort(String transportTypeShort) {
        this.transportTypeShort = transportTypeShort;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

   
    
}
