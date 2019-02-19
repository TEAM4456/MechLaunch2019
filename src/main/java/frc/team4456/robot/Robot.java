package frc.team4456.robot;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team4456.robot.subsystems.*;

public class Robot extends TimedRobot {
	
	public static Climb climb;
	public static Crawl crawl;
	public static Drive drive;
	public static Elevator elevator;
	public static Pneumatics pneumatics;
	public static Controls controls;
	
	
	@Override 
	public void robotInit() {
		
		System.out.println("robotInit() called");
		
		//CameraServer.getInstance().startAutomaticCapture();
		
		RobotMap.init();
		
		climb = new Climb();
		drive = new Drive();
		elevator = new Elevator();
		pneumatics = new Pneumatics();
		crawl = new Crawl();
		
		controls = new Controls();
		
	}
	
	@Override
	public void robotPeriodic() {
		System.out.println("elevator encoder: " + RobotMap.liftTalon.getSelectedSensorPosition(0));
		/*
		System.out.println("button 1: " + Controls.buttonBoard.getVertiButton1Held());
		System.out.println("button 2: " + Controls.buttonBoard.getVertiButton2Held());
		System.out.println("button 3: " + Controls.buttonBoard.getVertiButton3Held());
		System.out.println("button 4: " + Controls.buttonBoard.getVertiButton4Held());
		*/
	}
	
	@Override 
	public void disabledInit() { }
	
	@Override
	public void autonomousInit() { }
	
	@Override
	public void teleopInit() { }
	
	@Override
	public void testInit() { }
	
	@Override
	public void disabledPeriodic() { }
	
	@Override
	public void autonomousPeriodic() { }
	
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		drive.betterArcadeDrive(controls.joystick);
		
		// elevator controls (commands don't behave well for some reason)
		if (Controls.buttonBoard.getLeftJoystickUp()) {
			elevator.raiseElevatorManual();
		} else if (Controls.buttonBoard.getLeftJoystickDown()) {
			elevator.lowerElevatorManual();
		} else if (Controls.buttonBoard.getVertiButton1Pressed()) {
			elevator.moveToPosition(0);
		} else if (Controls.buttonBoard.getVertiButton2Pressed()) {
			elevator.moveToPosition(1);
		} else if (Controls.buttonBoard.getVertiButton3Pressed()) {
			elevator.moveToPosition(2);
		} else if (Controls.buttonBoard.getVertiButton4Pressed()) {
			elevator.moveToPosition(3);
		}
		
	}
	
	@Override 
	public void testPeriodic() { }
	
}
