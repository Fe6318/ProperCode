// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6318.Proper;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController tankDriveFrontLeftSpeedController;
    public static SpeedController tankDriveRearLeftSpeedController;
    public static SpeedController tankDriveFrontRightSpeedController;
    public static SpeedController tankDriveRearRightSpeedController;
    public static RobotDrive tankDriveRobotDrive41;
    public static AnalogGyro tankDriveAnalogGyro1;
    public static SpeedController scissorLiftLiftSpeedController;
    public static SpeedController wristWristSpeedController;
    public static Compressor grabberCompressor1;
    public static DoubleSolenoid grabberGrabberDoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        tankDriveFrontLeftSpeedController = new Spark(0);
        LiveWindow.addActuator("TankDrive", "FrontLeftSpeedController", (Spark) tankDriveFrontLeftSpeedController);
        tankDriveFrontLeftSpeedController.setInverted(false);
        tankDriveRearLeftSpeedController = new Spark(1);
        LiveWindow.addActuator("TankDrive", "RearLeftSpeedController", (Spark) tankDriveRearLeftSpeedController);
        tankDriveRearLeftSpeedController.setInverted(false);
        tankDriveFrontRightSpeedController = new Spark(2);
        LiveWindow.addActuator("TankDrive", "FrontRightSpeedController", (Spark) tankDriveFrontRightSpeedController);
        tankDriveFrontRightSpeedController.setInverted(false);
        tankDriveRearRightSpeedController = new Spark(3);
        LiveWindow.addActuator("TankDrive", "RearRightSpeedController", (Spark) tankDriveRearRightSpeedController);
        tankDriveRearRightSpeedController.setInverted(false);
        tankDriveRobotDrive41 = new RobotDrive(tankDriveFrontLeftSpeedController, tankDriveRearLeftSpeedController,
              tankDriveFrontRightSpeedController, tankDriveRearRightSpeedController);
        
        tankDriveRobotDrive41.setSafetyEnabled(true);
        tankDriveRobotDrive41.setExpiration(0.1);
        tankDriveRobotDrive41.setSensitivity(0.5);
        tankDriveRobotDrive41.setMaxOutput(0.8);

        tankDriveRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        tankDriveAnalogGyro1 = new AnalogGyro(0);
        LiveWindow.addSensor("TankDrive", "AnalogGyro 1", tankDriveAnalogGyro1);
        tankDriveAnalogGyro1.setSensitivity(0.007);
        scissorLiftLiftSpeedController = new Spark(4);
        LiveWindow.addActuator("ScissorLift", "LiftSpeedController", (Spark) scissorLiftLiftSpeedController);
        scissorLiftLiftSpeedController.setInverted(false);
        wristWristSpeedController = new VictorSP(5);
        LiveWindow.addActuator("Wrist", "WristSpeedController", (VictorSP) wristWristSpeedController);
        wristWristSpeedController.setInverted(false);
        grabberCompressor1 = new Compressor(0);
        LiveWindow.addActuator("Grabber", "Compressor 1", grabberCompressor1);
        
        //Warning, the two modules in robot builder are different!
        grabberGrabberDoubleSolenoid = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Grabber", "GrabberDoubleSolenoid", grabberGrabberDoubleSolenoid);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
