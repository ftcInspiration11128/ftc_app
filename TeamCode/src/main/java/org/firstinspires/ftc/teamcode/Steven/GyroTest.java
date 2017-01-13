package org.firstinspires.ftc.teamcode.Steven;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.GyroSensor;

/**
 * Created by inspirationteam on 12/11/2016.
 */
@Autonomous(name = "gyroTest", group = "PushBot")
//@Disabled
public class GyroTest extends OpMode {

    GyroSensor gyroSensor;

    @Override
    public void init() {
        gyroSensor = hardwareMap.gyroSensor.get("gyroSensor");

        telemetry.addData(">", "Gyro Calibrating. Do Not move!");
        telemetry.update();
        gyroSensor.calibrate();
        

}

    @Override
    public void init_loop() {
    }

    @Override
    public void start(){


    }

    @Override
    public void loop() {
        while(gyroSensor.isCalibrating()){

        }
        telemetry.addData("Gyro heading value (Z axis value): ", gyroSensor.getHeading());
        telemetry.update();
        //if (gyroSensor.getHeading() == 0){
           // telemetry.addData("","You have reached the target value (0)");
        //}


    }

    @Override
    public void stop(){

    }

}
