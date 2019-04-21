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
public class Packaging {
    private String packagingId;
    private int packagingLength;
    private int packagingWidth;
    private int packagingHeight;
    private int containersOnHU;

    public Packaging(String packagingId) {
        this.packagingId = packagingId;
    }

    public String getPackagingId() {
        return packagingId;
    }

    public void setPackagingId(String packagingId) {
        this.packagingId = packagingId;
    }

    public int getPackagingLength() {
        return packagingLength;
    }

    public void setPackagingLength(int packagingLength) {
        this.packagingLength = packagingLength;
    }

    public int getPackagingWidth() {
        return packagingWidth;
    }

    public void setPackagingWidth(int packagingWidth) {
        this.packagingWidth = packagingWidth;
    }

    public int getPackagingHeight() {
        return packagingHeight;
    }

    public void setPackagingHeight(int packagingHeight) {
        this.packagingHeight = packagingHeight;
    }

    public int getContainersOnHU() {
        return containersOnHU;
    }

    public void setContainersOnHU(int containersOnHU) {
        this.containersOnHU = containersOnHU;
    }
    
    
}
