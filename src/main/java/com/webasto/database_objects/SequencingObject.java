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
public abstract class SequencingObject {
    private String SObjectName;
    private String SObjectNumber;
    private String SObjectRevisionIndex;
    private String SObjectLocation;
    private Supermarket sup;

    public Supermarket getSup() {
        return sup;
    }

    public void setSup(Supermarket sup) {
        this.sup = sup;
    }

    public String getSObjectLocation() {
        return SObjectLocation;
    }

    public void setSObjectLocation(String SObjectLocation) {
        this.SObjectLocation = SObjectLocation;
    }
    private int SObjectId;

    public SequencingObject(String SObjectName, String SObjectNumber, int SObjectId) {
        this.SObjectName = SObjectName;
        this.SObjectNumber = SObjectNumber;
        this.SObjectId = SObjectId;
    }

    public String getSObjectName() {
        return SObjectName;
    }

    public void setSObjectName(String SObjectName) {
        this.SObjectName = SObjectName;
    }

    public String getSObjectNumber() {
        return SObjectNumber;
    }

    public void setSObjectNumber(String SObjectNumber) {
        this.SObjectNumber = SObjectNumber;
    }

    public String getSObjectRevisionIndex() {
        return SObjectRevisionIndex;
    }

    public void setSObjectRevisionIndex(String SObjectIndex) {
        this.SObjectRevisionIndex = SObjectIndex;
    }

    public int getSObjectId() {
        return SObjectId;
    }

    public void setSObjectId(int SObjectId) {
        this.SObjectId = SObjectId;
    }
    
    
}
