package org.example;

public class Laptop {
    private String brand;
    private String model;
    private String color;
    private Double screenSize;
    private String OS;
    private Integer RAM;
    private Integer HDD;


    public Laptop(String brand, String model, String color, Double screenSize, String OS, Integer RAM, Integer HDD) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.OS = OS;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getHDD() {
        return HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", screenSize=" + screenSize +
                ", OS='" + OS + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                '}';
    }
}
