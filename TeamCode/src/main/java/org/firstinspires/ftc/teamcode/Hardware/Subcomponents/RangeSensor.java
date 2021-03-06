package org.firstinspires.ftc.teamcode.Hardware.Subcomponents;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by adityamavalankar on 11/5/18.
 */

public abstract class RangeSensor implements DistanceSensor {

    private DistanceSensor rs;
    public HardwareMap hwmap;

    public void init(String hardwareName, HardwareMap inputMap) {

        hwmap = inputMap;

        rs = hwmap.get(DistanceSensor.class, hardwareName);
    }



}
