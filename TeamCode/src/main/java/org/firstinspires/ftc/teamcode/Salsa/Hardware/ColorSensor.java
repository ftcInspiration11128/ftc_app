package org.firstinspires.ftc.teamcode.Salsa.Hardware;

import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by adityamavalankar on 11/5/18.
 */

public class ColorSensor {

    public com.qualcomm.robotcore.hardware.ColorSensor cs;
    public HardwareMap hwmap;

    public void init(String hardwareName, HardwareMap inputMap) {

        hwmap = inputMap;

        cs = hwmap.get(com.qualcomm.robotcore.hardware.ColorSensor.class, hardwareName);
    }



}
