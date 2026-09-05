package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.constants.Hardware;

@TeleOp
public class ZaraDrive extends OpMode {

    DcMotor rf;
    DcMotor rr;
    DcMotor lf;
    DcMotor lr;

    public void init () {
        rf=hardwareMap.get(DcMotor.class, Hardware.MotorNames.frontRight);
       rr=hardwareMap.get(DcMotor.class, Hardware.MotorNames.frontLeft);
        lf=hardwareMap.get(DcMotor.class, Hardware.MotorNames.backRight);
       lr=hardwareMap.get(DcMotor.class, Hardware.MotorNames.backLeft);

        if (Hardware.MotorReversed.frontRight) {
           rf.setDirection(DcMotorSimple.Direction.REVERSE);
        }

        if (Hardware.MotorReversed.frontLeft) {
            rr.setDirection(DcMotorSimple.Direction.REVERSE);
        }

        if (Hardware.MotorReversed.backRight) {
            lf.setDirection(DcMotorSimple.Direction.REVERSE);
        }

        if (Hardware.MotorReversed.backLeft) {
           lr.setDirection(DcMotorSimple.Direction.REVERSE);
        }

       rf.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
        rr.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
        lf.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
        lr.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
    }

    public void loop () {
        double x = gamepad1.left_stick_x;
        double y = gamepad1.left_stick_x;
        double r = gamepad1.right_stick_x;
        double frp = -x+y-r;
        double flp = x+y+r;
        double brp = x+y-r;
        double blp = -x+y+r;
        rf.setPower(frp);
       rr.setPower(flp);
       lf.setPower(brp);
        lr.setPower(blp);
    }
}
