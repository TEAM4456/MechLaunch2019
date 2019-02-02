package frc.team4456.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4456.robot.RobotMap;

public class Drive extends Subsystem{

	private final WPI_TalonSRX leftMain = RobotMap.leftMain;
	private final WPI_TalonSRX rightMain = RobotMap.rightMain;
	private final WPI_TalonSRX leftCrawl = RobotMap.leftCrawl;
	private SerialPort sp;
	private boolean tracking;
	
	public Drive(){
		tracking = false;
	}
	
	protected void initDefaultCommand() {}

	//Arcade drive to run when using the computer vision.
	public void trackingArcadeDrive(Joystick joystick) {
		sp = new SerialPort(1200, SerialPort.Port.kUSB);
		double x = 0.01;
		
		double xValue = joystick.getRawAxis(0);
		double yValue = joystick.getRawAxis(1);
		double yValueLeg = joystick.getRawAxis(5);

		// deadzone
		if (xValue > -0.2 && xValue < 0.2) {
			xValue = 0;
		}
		if (yValue > -0.2 && yValue < 0.2) {
			yValue = 0;
		}
		if (yValueLeg > -0.2 && yValueLeg < 0.2) {
			yValueLeg = 0;
		}
		
		//tracking stuff
		double leftValue = -(yValue - (xValue / 2));
		double rightValue = -(yValue + (xValue / 2));

		leftMain.set(ControlMode.Velocity, leftValue * 2900);
		rightMain.set(ControlMode.Velocity, rightValue * 2900);
		leftCrawl.set(ControlMode.Velocity, yValueLeg * 2900);
	}

	//Arcade drive to run when driving normally.
	public void arcadeDrive(Joystick joystick) {
		double xValue = joystick.getRawAxis(0);
		double yValue = joystick.getRawAxis(1);
		double yValueLeg = joystick.getRawAxis(5);

		// deadzone
		if (xValue > -0.2 && xValue < 0.2) {
			xValue = 0;
		}
		if (yValue > -0.2 && yValue < 0.2) {
			yValue = 0;
		}
		if (yValueLeg > -0.2 && yValueLeg < 0.2) {
			yValueLeg = 0;
		}

		double leftValue = -(yValue - (xValue / 2));
		double rightValue = -(yValue + (xValue / 2));

		leftMain.set(ControlMode.Velocity, leftValue * 2900);
		rightMain.set(ControlMode.Velocity, rightValue * 2900);
		leftCrawl.set(ControlMode.PercentOutput, yValueLeg);
	}
	
	public boolean isTracking(){
		return tracking;
	}
	
	public void toggleTracking(){
		tracking = !tracking;
	}
}
