package frc.team4456.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.RobotMap;

public class Drive extends Subsystem {
	
	private final WPI_TalonSRX leftDriveTalon = RobotMap.leftDriveMaster;
	private final WPI_TalonSRX rightDriveTalon = RobotMap.rightDriveMaster;
	
	protected void initDefaultCommand() {}
	
	public void betterArcadeDrive(Joystick joystick) {
		
		double xValue = joystick.getRawAxis(0);
		double yValue = joystick.getRawAxis(1);
		
		// deadzone
		if (xValue > -0.2 && xValue < 0.2) {
			xValue = 0;
		}
		if (yValue > -0.2 && yValue < 0.2) {
			yValue = 0;
		}
		
		
		double leftValue = -(yValue - (xValue / 2));
		double rightValue = -(yValue + (xValue / 2));
		
		System.out.println("leftValue: " + leftValue);
		System.out.println("rightValue: " + rightValue);
		
		//leftDriveTalon.set(ControlMode.Velocity, leftValue * 2900);
		//rightDriveTalon.set(ControlMode.Velocity, rightValue * 2900);
		leftDriveTalon.set(ControlMode.PercentOutput, leftValue);
		rightDriveTalon.set(ControlMode.PercentOutput, rightValue);
		
	}
	
}
