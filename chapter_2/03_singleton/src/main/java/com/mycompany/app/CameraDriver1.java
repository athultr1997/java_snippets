package com.mycompany.app;

public class CameraDriver1 {
    String model;

    public static final CameraDriver1 INSTANCE = new CameraDriver1("kodak");

    private CameraDriver1(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

}
