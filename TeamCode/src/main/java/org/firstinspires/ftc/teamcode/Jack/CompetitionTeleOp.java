package org.firstinspires.ftc.teamcode.Jack;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by inspirationteam on 11/10/2016.
 */
@TeleOp(name = "#11183: TeleOp Competition", group = "Robot")
public class CompetitionTeleOp extends OpMode {
/*
   Define the actuator we use in the robot here
*/
    DcMotor leftWheelMotorFront;
    DcMotor leftWheelMotorBack;
    DcMotor rightWheelMotorFront;
    DcMotor rightWheelMotorBack;

/*
    Get references to the hardware installed on the robot and anme them here
*/
    @Override
    public void init() {
        leftWheelMotorFront = hardwareMap.dcMotor.get("leftWheelMotorFront");
        leftWheelMotorBack = hardwareMap.dcMotor.get("leftWheelMotorBack");
        rightWheelMotorFront = hardwareMap.dcMotor.get("rightWheelMotorFront");
        rightWheelMotorBack = hardwareMap.dcMotor.get("rightWheelMotorBack");

        /* lets reverse the direction of the right wheel motor*/
        rightWheelMotorFront.setDirection(DcMotor.Direction.REVERSE);
        rightWheelMotorBack.setDirection(DcMotor.Direction.REVERSE);
    }
    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
    }


    @Override
    public void loop(){
        float leftY_gp1 = -gamepad1.left_stick_y;
        float rightY_gp1 = -gamepad1.right_stick_y;

        //set the power of the motors with the game pad values
        leftWheelMotorFront.setPower(leftY_gp1);
        leftWheelMotorBack.setPower(leftY_gp1);
        rightWheelMotorFront.setPower(rightY_gp1);
        rightWheelMotorBack.setPower(rightY_gp1);
    }
    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }

}