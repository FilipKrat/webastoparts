/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webasto.database_objects;

import java.util.ArrayList;

/**
 *
 * @author FilipKrat
 */
public class Kit extends SequencingObject{
    private ArrayList<Material>materials;
    public Kit(String SObjectName, String SObjectNumber, int SObjectId) {
        super(SObjectName, SObjectNumber, SObjectId);
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }
    
    
}
