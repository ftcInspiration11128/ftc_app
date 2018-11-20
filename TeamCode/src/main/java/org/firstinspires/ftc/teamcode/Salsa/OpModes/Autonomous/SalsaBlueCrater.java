package org.firstinspires.ftc.teamcode.Salsa.OpModes.Autonomous;

import com.disnodeteam.dogecv.detectors.roverrukus.SamplingOrderDetector;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Salsa.Constants;
import org.firstinspires.ftc.teamcode.Salsa.OpModes.SalsaLinearOpMode;
import org.firstinspires.ftc.teamcode.Salsa.Vision.SamplingDetector;

/**
 * Created by adityamavalankar on 11/19/18.
 */

@Autonomous(name = "Salsa Blue Crater BETA", group = "Salsa")
public class SalsaBlueCrater extends SalsaLinearOpMode {

    SamplingDetector detector = new SamplingDetector();

    @Override
    public void runOpMode() throws InterruptedException {
        constants = new Constants();

        robot.setHardwareMap(hardwareMap);
        robot.initDrivetrain();
        robot.initVision();

        robot.enableVision();
        telemetry.addLine("Initialization done ... Ready to start!");
        telemetry.update();

        waitForStart();

        sleep(50);

        SamplingOrderDetector.GoldLocation samplingOrder = robot.getSamplingOrderSmart();
        sleep(500);
        telemetry.addData("Gold Location", samplingOrder);
        telemetry.update();

        sleep(5000);


    }


}
