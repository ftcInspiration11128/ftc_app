package org.firstinspires.ftc.teamcode.ftc2017to2018season.Archives.No_Longer_In_Use_and_For_Reference.Old_Autonomous_Programs.Delta.Old_12_2_17._12_2_17;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.robotcore.external.navigation.RelicRecoveryVuMark;

//10-28-17
@Autonomous(name="Autonomous Blue Test Front")
@Disabled
public class blue_frontCorner extends Autonomous_General_old {

    public double rsBuffer = 20.00;


    @Override
    public void runOpMode() {


        vuforiaInit(true, true);
        telemetry.addData("","Vuforia Initiated");
        telemetry.update();
        initiate();
        telemetry.addData("--->", "Gyro Calibrating");
        telemetry.update();
        gyro.calibrate();

        while(gyro.isCalibrating()){
            sleep(50);
            idle();

        }

        telemetry.addData("---->","Gyro Calibrated. Good to go...");
        telemetry.update();

        waitForStart();

        gyro.resetZAxisIntegrator();


        startTracking();
        telemetry.addData("","READY TO TRACK");
        telemetry.update();


        while(!vuMarkFound()){

        }

        jewelServo.setPosition(0);
        telemetry.addData("jewelServo Position", jewelServo.getPosition());
        telemetry.update();
        sleep(1000);
        readColor();
        //returnImage();
        telemetry.addData("Vumark" , vuMark);
        telemetry.update();
        closeGlyphManipulator();
        sleep(1000);
        //moveUpGlyph(2.54);
        sleep(1000);

        if(ballColor.equals("red")){
            encoderMecanumDrive(0.9, -10,-10,5000,0);
            jewelServo.setPosition(1);
            sleep(1000);
            encoderMecanumDrive(0.9,65,65,5000,0);
            sleep(1000);
        }
        else if(ballColor.equals("blue")){
            encoderMecanumDrive(0.9,65,65,5000,0);
            jewelServo.setPosition(1);
            sleep(1000);
        }
        else{
            jewelServo.setPosition(1);
            sleep(1000);
            encoderMecanumDrive(0.9,65,65,5000,0);
        }


        gyroTurn(0.3,-90);
        sleep(1000);

        if (vuMark == RelicRecoveryVuMark.CENTER){
            simpleRangeDistance(59, 0.6, rsBuffer);
        }
        else if (vuMark == RelicRecoveryVuMark.LEFT){
            simpleRangeDistance(42, 0.6, rsBuffer);
        }
        else if (vuMark == RelicRecoveryVuMark.RIGHT){
            simpleRangeDistance(76, 0.6, rsBuffer);

        }


        sleep(1000);

        gyroTurn(0.3,0);

        sleep(750);

        openGlyphManipulator();

        encoderMecanumDrive(0.3,30,30,1000,0);
    }


}