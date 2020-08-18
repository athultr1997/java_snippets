package com.mycompany.app;

import java.util.logging.Level; 
import java.util.logging.Logger;

public class App
{
    public static void main( String[] args )
    {
        final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // Approach-I
        CameraDriver1 cameraDriver1 = CameraDriver1.INSTANCE;
        logger.log(Level.INFO, "Using Approach-I: {0}", cameraDriver1.getModel());

        // Approach-II: Using static factory
        CameraDriver2 cameraDriver2 = CameraDriver2.getInstance();
        logger.log(Level.INFO, "Using Approach-II: {0}", cameraDriver2.getModel());

        // Approach-III: Using singleton enum
        CameraDriver3 cameraDriver3 = CameraDriver3.INSTANCE;
        logger.log(Level.INFO, "Using Approach-III: {0}", cameraDriver3.getModel());
    }
}
