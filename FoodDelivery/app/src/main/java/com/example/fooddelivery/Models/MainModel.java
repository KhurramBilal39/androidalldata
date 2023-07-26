package com.example.fooddelivery.Models;

public class MainModel {
    int mainImage;
    String mainPrice, mainDescription, mainNamed;

    public MainModel(int mainImage, String mainPrice, String mainDescription, String mainNamed) {
        this.mainImage = mainImage;
        this.mainPrice = mainPrice;
        this.mainDescription = mainDescription;
        this.mainNamed = mainNamed;
    }

    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }

    public String getMainPrice() {
        return mainPrice;
    }

    public void setMainPrice(String mainPrice) {
        this.mainPrice = mainPrice;
    }

    public String getMainDescription() {
        return mainDescription;
    }

    public void setMainDescription(String mainDescription) {
        this.mainDescription = mainDescription;
    }

    public String getMainNamed() {
        return mainNamed;
    }

    public void setMainNamed(String mainNamed) {
        this.mainNamed = mainNamed;
    }
}