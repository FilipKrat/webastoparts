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
public class Supermarket {
    private int SupermarketId;
    private String SupermarketName;

    public Supermarket(int SupermarketId, String SupermarketName) {
        this.SupermarketId = SupermarketId;
        this.SupermarketName = SupermarketName;
    }

    public int getSupermarketId() {
        return SupermarketId;
    }

    public void setSupermarketId(int SupermarketId) {
        this.SupermarketId = SupermarketId;
    }

    public String getSupermarketName() {
        return SupermarketName;
    }

    public void setSupermarketName(String SupermarketName) {
        this.SupermarketName = SupermarketName;
    }
    
    
}
