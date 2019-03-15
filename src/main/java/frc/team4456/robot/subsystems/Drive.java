package frc.team4456.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.Globals;
import frc.team4456.robot.RobotMap;

public class Drive extends Subsystem {
	
	private final WPI_TalonSRX leftDriveTalon = RobotMap.leftDriveMaster;
	private final WPI_TalonSRX rightDriveTalon = RobotMap.rightDriveMaster;
	
	private final Joystick joystick;
	
	public Drive(Joystick driverJoystick) {
		joystick = driverJoystick;
		leftDriveTalon.config_kP(0, Globals.leftDriveP, 10);
		leftDriveTalon.config_kI(0, Globals.leftDriveI, 10);
		leftDriveTalon.config_kD(0, Globals.leftDriveD, 10);
		leftDriveTalon.config_kF(0, Globals.leftDriveF, 10);
		rightDriveTalon.config_kP(0, Globals.rightDriveP, 10);
		rightDriveTalon.config_kI(0, Globals.rightDriveI, 10);
		rightDriveTalon.config_kD(0, Globals.rightDriveD, 10);
		rightDriveTalon.config_kF(0, Globals.rightDriveF, 10);
	}
	
	protected void initDefaultCommand() { }
	
	public void betterArcadeDrive() {
		
		double xValue = joystick.getRawAxis(0);
		double yValue = joystick.getRawAxis(1);
		double rtValue = joystick.getRawAxis(3);
		
		// deadzone
		if (xValue > -0.2 && xValue < 0.2) {
			xValue = 0;
		}
		if (yValue > -0.2 && yValue < 0.2) {
			yValue = 0;
		}
		
		double leftValue = -(yValue - (xValue / 2)) * Math.min(1.2 - rtValue, 1);
		double rightValue = -(yValue + (xValue / 2)) * Math.min(1.2 - rtValue, 1);
		
		//System.out.println("leftValue: " + leftValue);
		//System.out.println("rightValue: " + rightValue);
		
		leftDriveTalon.set(ControlMode.Velocity, leftValue * 2900);
		rightDriveTalon.set(ControlMode.Velocity, rightValue * 2900);
		//leftDriveTalon.set(ControlMode.PercentOutput, leftValue);
		//rightDriveTalon.set(ControlMode.PercentOutput, rightValue);
		
	}
	
}
