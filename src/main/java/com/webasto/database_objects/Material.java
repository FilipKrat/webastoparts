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
public class Material extends SequencingObject{
    private int partsInContainer;
    private int minContainers;
    private int maxContainers;
    private int orderAmount;
    private int boxesInRow;
    private int boxesInColumn;
    private int partsAmount;
    private MaterialType materialType;
    private ManufacturingGroup manuGroup;
    private int safetyStock;
    private Packaging packaging;
    private int stackability;
    private int packagingInstruction;
    private Location location;
    private UnloadingPoint unloadingPt;
    private Supplier supplier;

    public int getPartsInContainer() {
        return partsInContainer;
    }

    public void setPartsInContainer(int partsInContainer) {
        this.partsInContainer = partsInContainer;
    }

    public int getMinContainers() {
        return minContainers;
    }

    public void setMinContainers(int minContainers) {
        this.minContainers = minContainers;
    }

    public int getMaxContainers() {
        return maxContainers;
    }

    public void setMaxContainers(int maxContainers) {
        this.maxContainers = maxContainers;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getBoxesInRow() {
        return boxesInRow;
    }

    public void setBoxesInRow(int boxesInRow) {
        this.boxesInRow = boxesInRow;
    }

    public int getBoxesInColumn() {
        return boxesInColumn;
    }

    public void setBoxesInColumn(int boxesInColumn) {
        this.boxesInColumn = boxesInColumn;
    }

    public int getPartsAmount() {
        return partsAmount;
    }

    public void setPartsAmount(int partsAmount) {
        this.partsAmount = partsAmount;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public ManufacturingGroup getManuGroup() {
        return manuGroup;
    }

    public void setManuGroup(ManufacturingGroup manuGroup) {
        this.manuGroup = manuGroup;
    }

    public int getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(int safetyStock) {
        this.safetyStock = safetyStock;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public int getStackability() {
        return stackability;
    }

    public void setStackability(int stackability) {
        this.stackability = stackability;
    }

    public int getPackagingInstruction() {
        return packagingInstruction;
    }

    public void setPackagingInstruction(int packagingInstruction) {
        this.packagingInstruction = packagingInstruction;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public UnloadingPoint getUnloadingPt() {
        return unloadingPt;
    }

    public void setUnloadingPt(UnloadingPoint unloadingPt) {
        this.unloadingPt = unloadingPt;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    
    public Material(String SObjectName, String SObjectNumber, int SObjectId) {
        super(SObjectName, SObjectNumber, SObjectId);
    }
    
}
