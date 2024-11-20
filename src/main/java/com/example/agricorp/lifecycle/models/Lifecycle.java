package com.example.agricorp.lifecycle.models;

public class Lifecycle {

    private String id;
    private String userId;
    private String namePlant;
    private String plant;
    private int value;
    private String image;
    private String status;
    private String time;
    private String about;

    // Constructor
    public Lifecycle(String id, String userId, String namePlant, String plant, int value, String image, String status, String time, String about) {
        this.id = id;
        this.userId = userId;
        this.namePlant = namePlant;
        this.plant = plant;
        this.value = value;
        this.image = image;
        this.status = status;
        this.time = time;
        this.about = about;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNamePlant() {
        return namePlant;
    }

    public void setNamePlant(String namePlant) {
        this.namePlant = namePlant;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
