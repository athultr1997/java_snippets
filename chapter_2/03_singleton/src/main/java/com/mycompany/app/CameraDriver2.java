package com.mycompany.app;

public class CameraDriver2 {
    String model;

    private static final CameraDriver2 INSTANCE = new CameraDriver2("kodak");

    private CameraDriver2(String model) {
        this.model = model;
    }

    public static CameraDriver2 getInstance() {
        return INSTANCE;
    }

    String getModel() {
        return model;
    }

}
