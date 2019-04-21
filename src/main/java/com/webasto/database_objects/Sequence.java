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
public class Sequence {
    private ArrayList<SequencingObject>content;
    private String locationArea;
    private String name;
    private String number;
    private String revisionIndex;
    private int sequencingId;

    public Sequence(String name, String number, int sequencingId) {
        this.name = name;
        this.number = number;
        this.sequencingId = sequencingId;
    }

    public ArrayList<SequencingObject> getContent() {
        return content;
    }

    public void setContent(ArrayList<SequencingObject> content) {
        this.content = content;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRevisionIndex() {
        return revisionIndex;
    }

    public void setRevisionIndex(String revisionIndex) {
        this.revisionIndex = revisionIndex;
    }

    public int getSequencingId() {
        return sequencingId;
    }

    public void setSequencingId(int sequencingId) {
        this.sequencingId = sequencingId;
    }
    
    
    
}
