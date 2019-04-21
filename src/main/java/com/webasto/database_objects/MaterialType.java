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
public class MaterialType {
    private String materialTypeName;
    private String materialTypeColor;

    public MaterialType(String materialTypeName, String materialTypeColor) {
        this.materialTypeName = materialTypeName;
        this.materialTypeColor = materialTypeColor;
    }

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName;
    }

    public String getMaterialTypeColor() {
        return materialTypeColor;
    }

    public void setMaterialTypeColor(String materialTypeColor) {
        this.materialTypeColor = materialTypeColor;
    }
    
}
