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
public class UnloadingPoint {
    private int UnloadingPtId;
    private String UnloadingPtName;

    public UnloadingPoint(int UnloadingPtId, String UnloadingPtName) {
        this.UnloadingPtId = UnloadingPtId;
        this.UnloadingPtName = UnloadingPtName;
    }

    public int getUnloadingPtId() {
        return UnloadingPtId;
    }

    public void setUnloadingPtId(int UnloadingPtId) {
        this.UnloadingPtId = UnloadingPtId;
    }

    public String getUnloadingPtName() {
        return UnloadingPtName;
    }

    public void setUnloadingPtName(String UnloadingPtName) {
        this.UnloadingPtName = UnloadingPtName;
    }
    
    
}
