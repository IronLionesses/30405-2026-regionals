package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.constants.Hardware;

@TeleOp
public class OndineDrive extends OpMode {
    DcMotor fl;
    DcMotor fr;
    DcMotor bl;
    DcMotor br;


    public void init() {

        fr = hardwareMap.get(DcMotor.class, Hardware.MotorNames.frontRight);
        fl = hardwareMap.get(DcMotor.class, Hardware.MotorNames.frontLeft);
        br = hardwareMap.get(DcMotor.class, Hardware.MotorNames.backRight);
        bl = hardwareMap.get(DcMotor.class, Hardware.MotorNames.backLeft);

        if (Hardware.MotorReversed.frontRight) {
            fr.setDirection(DcMotorSimple.Direction.REVERSE);
        }

        if (Hardware.MotorReversed.frontLeft) {
            fl.setDirection(DcMotorSimple.Direction.REVERSE);
        }

        if (Hardware.MotorReversed.backRight) {
            br.setDirection(DcMotorSimple.Direction.REVERSE);
        }

        if (Hardware.MotorReversed.backLeft) {
            bl.setDirection(DcMotorSimple.Direction.REVERSE);
        }

        fl.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
        fr.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
        bl.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
        br.setZeroPowerBehavior(Hardware.ZeroPowerMode.driveMotors);
    }

    public void loop() {
        double x= gamepad1.left_stick_x;
        double y= gamepad1.left_stick_y;
        double r= gamepad1.right_stick_x;
        double frp= -x+y-r;
        double flp= x+y+r;
        double brp= x+y+r;
        double blp= -x+y-r;
        fr.setPower(frp);
        fl.setPower(flp);
        bl.setPower(blp);
        br.setPower(brp);

    }
}