package org.firstinspires.ftc.teamcode.constants;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Hardware {
    public static Object Button; // may not be accurate, experimental (see OndineDrive)

    public static class MotorNames {
        public static String frontRight = "rf"; // 0
        public static String backRight = "rr"; // 1
        public static String frontLeft = "lf"; // 2
        public static String backLeft = "lr"; // 3
        public static String intake = "intakeMotor"; // 0
        public static String outtake = "outtakeMotor"; // 0 (?) idk follow up
    }

    public static class MotorReversed {
        public static boolean frontRight = true;
        public static boolean backRight = true;
        public static boolean frontLeft = false;
        public static boolean backLeft = false;
        public static boolean intake = false;
        public static boolean outtake = false;
    }

    public static class ZeroPowerMode {
        public static DcMotor.ZeroPowerBehavior driveMotors = DcMotor.ZeroPowerBehavior.FLOAT;
    }
}
