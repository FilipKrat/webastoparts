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
public class ManufacturingGroup {
    private int manGroupId;
    private String manGroupName;
    private String manGroupColor;

    public ManufacturingGroup(int manGroupId, String manGroupName, String manGroupColor) {
        this.manGroupId = manGroupId;
        this.manGroupName = manGroupName;
        this.manGroupColor = manGroupColor;
    }

    public int getManGroupId() {
        return manGroupId;
    }

    public void setManGroupId(int manGroupId) {
        this.manGroupId = manGroupId;
    }

    public String getManGroupName() {
        return manGroupName;
    }

    public void setManGroupName(String manGroupName) {
        this.manGroupName = manGroupName;
    }

    public String getManGroupColor() {
        return manGroupColor;
    }

    public void setManGroupColor(String manGroupColor) {
        this.manGroupColor = manGroupColor;
    }
    
    
}
